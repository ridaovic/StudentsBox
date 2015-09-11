package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.EtudiantEntity;
import entity.SalleEntity;

@Repository
public class SalleDaoImpl implements SalleDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addSalle(SalleEntity salle) {
		this.sessionFactory.getCurrentSession().save(salle);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SalleEntity> getAllSalles() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from SalleEntity").list();
	}

	@Override
	public void deleteSalle(Integer salleId) {
		SalleEntity salle = (SalleEntity) sessionFactory.getCurrentSession().load(
				SalleEntity.class, salleId);
        if (null != salle) {
        	this.sessionFactory.getCurrentSession().delete(salle);
        }
		
	}

	@Override
	public void editeSalle(SalleEntity salle) {
		
		this.sessionFactory.getCurrentSession().update(salle);
        
	}

	@Override
	public SalleEntity getSalleById(Integer salleId) {
		SalleEntity salle = (SalleEntity) sessionFactory.getCurrentSession().get(
				SalleEntity.class, salleId);
		return salle;
	}
	
	
	@Override
	public void enableDisableSalle(Integer salleId) {
		SalleEntity salle = (SalleEntity) sessionFactory.getCurrentSession().get(
				SalleEntity.class, salleId);
        if (null != salle) {
        	if (salle.getStatut()) {
				salle.setStatut(false);
			} else {
				salle.setStatut(true);
			}
        	this.sessionFactory.getCurrentSession().update(salle);
        }
		
	}
	
	

}
