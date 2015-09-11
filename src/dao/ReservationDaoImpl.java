package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.ReclamationEntity;
import entity.ReservationEntity;;

@Repository
public class ReservationDaoImpl implements ReservationDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addReservation(ReservationEntity reservation) {
		this.sessionFactory.getCurrentSession().save(reservation);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ReservationEntity> getAllReservations() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from ReservationEntity").list();
	}

	@Override
	public void deleteReservation(Integer reservationId) {
		ReservationEntity reservation = (ReservationEntity) sessionFactory.getCurrentSession().load(
				ReservationEntity.class, reservationId);
        if (null != reservation) {
        	this.sessionFactory.getCurrentSession().delete(reservation);
        }
		
	}

	@Override
	public void editeReservation(ReservationEntity reservation) {
		
		this.sessionFactory.getCurrentSession().update(reservation);
        
	}

	@Override
	public ReservationEntity getReservationById(Integer reservationId) {
		ReservationEntity reservation = (ReservationEntity) sessionFactory.getCurrentSession().get(
				ReservationEntity.class, reservationId);
		return reservation;
	}
	
	
	
	@Override
	public void validerReservation(Integer reservationId) {
		ReservationEntity reservation = (ReservationEntity) sessionFactory.getCurrentSession().get(
				ReservationEntity.class, reservationId);
        if (null != reservation) {
        	if (reservation.getStatut()) {
        		reservation.setStatut(false);
			} else {
				reservation.setStatut(true);
			}
        	this.sessionFactory.getCurrentSession().update(reservation);
        }
		
	}
	
	

}
