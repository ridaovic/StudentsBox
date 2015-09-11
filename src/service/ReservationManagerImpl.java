package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ReservationDAO;
import entity.ReservationEntity;

@Service
public class ReservationManagerImpl implements ReservationManager {
	
	@Autowired
    private ReservationDAO reservationDAO;
	
	@Override
	@Transactional
	public void addReservation(ReservationEntity reservation) {
		reservationDAO.addReservation(reservation);
		
	}

	@Override
	@Transactional
	public List<ReservationEntity> getAllReservations() {
		return reservationDAO.getAllReservations();
	}

	@Override
	@Transactional
	public void deleteReservation(Integer reservationId) {
		reservationDAO.deleteReservation(reservationId);
		
	}

	public void setReservationDAO(ReservationDAO reservationDAO) {
		this.reservationDAO = reservationDAO;
	}

	@Override
	@Transactional
	public void editeReservation(ReservationEntity reservation) {
		reservationDAO.editeReservation(reservation);
		
	}

	@Override
	@Transactional
	public ReservationEntity getReservationById(Integer reservationId) {
		return reservationDAO.getReservationById(reservationId);
	}
	
	
	@Override
	@Transactional
	public void validerReservation(Integer reservationId) {
		reservationDAO.validerReservation(reservationId);
	}
	
}
