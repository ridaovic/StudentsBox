package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.PlaintEntity;

@Repository
public class PlaintDaoImpl implements PlaintDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addPlaint(PlaintEntity plaint) {
		this.sessionFactory.getCurrentSession().save(plaint);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PlaintEntity> getAllPlaints() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from PlaintEntity").list();
	}

	@Override
	public void deletePlaint(Integer plaintId) {
		PlaintEntity plaint = (PlaintEntity) sessionFactory.getCurrentSession().load(
				PlaintEntity.class, plaintId);
        if (null != plaint) {
        	this.sessionFactory.getCurrentSession().delete(plaint);
        }
		
	}

	@Override
	public void editePlaint(PlaintEntity plaint) {
		
		this.sessionFactory.getCurrentSession().update(plaint);
        
	}

	@Override
	public PlaintEntity getPlaintById(Integer plaintId) {
		PlaintEntity plaint = (PlaintEntity) sessionFactory.getCurrentSession().get(
				PlaintEntity.class, plaintId);
		return plaint;
	}
	
	@Override
	public void visibilitePlaint(Integer plaintId) {
		PlaintEntity plaint = (PlaintEntity) sessionFactory.getCurrentSession().get(
				PlaintEntity.class, plaintId);
        if (null != plaint) {
        	if (plaint.getVisibilite()) {
				plaint.setVisibilite(false);
			} else {
				plaint.setVisibilite(true);
			}
        	this.sessionFactory.getCurrentSession().update(plaint);
        }
		
	}

}
