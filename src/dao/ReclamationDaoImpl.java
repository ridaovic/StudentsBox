package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.PlaintEntity;
import entity.ReclamationEntity;;

@Repository
public class ReclamationDaoImpl implements ReclamationDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addReclamation(ReclamationEntity reclamation) {
		this.sessionFactory.getCurrentSession().save(reclamation);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ReclamationEntity> getAllReclamations() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from ReclamationEntity ORDER BY date DESC").list();
	}
	
	
	@Override
	public List<ReclamationEntity> getAllReclamationsVisible() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from ReclamationEntity WHERE visibilite=1 ORDER BY date DESC").list();
	}
	
	@Override
	public void deleteReclamation(Integer reclamationId) {
		ReclamationEntity reclamation = (ReclamationEntity) sessionFactory.getCurrentSession().load(
				ReclamationEntity.class, reclamationId);
        if (null != reclamation) {
        	this.sessionFactory.getCurrentSession().delete(reclamation);
        }
		
	}

	@Override
	public void editeReclamation(ReclamationEntity reclamation) {
		
		this.sessionFactory.getCurrentSession().update(reclamation);
        
	}

	@Override
	public ReclamationEntity getReclamationById(Integer reclamationId) {
		ReclamationEntity reclamation = (ReclamationEntity) sessionFactory.getCurrentSession().get(
				ReclamationEntity.class, reclamationId);
		return reclamation;
	}
	

	
	@Override
	public void visibiliteReclamation(Integer reclamationId) {
		ReclamationEntity reclamation = (ReclamationEntity) sessionFactory.getCurrentSession().get(
				ReclamationEntity.class, reclamationId);
        if (null != reclamation) {
        	if (reclamation.getVisibilite()) {
        		reclamation.setVisibilite(false);
			} else {
				reclamation.setVisibilite(true);
			}
        	this.sessionFactory.getCurrentSession().update(reclamation);
        }
		
	}
	

}
