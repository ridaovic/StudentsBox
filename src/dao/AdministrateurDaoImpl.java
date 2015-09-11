package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.AdministrateurEntity;

@Repository
public class AdministrateurDaoImpl implements AdministrateurDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addAdministrateur(AdministrateurEntity administrateur) {
		this.sessionFactory.getCurrentSession().save(administrateur);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AdministrateurEntity> getAllAdministrateurs() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from AdministrateurEntity").list();
	}

	@Override
	public void deleteAdministrateur(Integer administrateurId) {
		AdministrateurEntity administrateur = (AdministrateurEntity) sessionFactory.getCurrentSession().load(
				AdministrateurEntity.class, administrateurId);
        if (null != administrateur) {
        	this.sessionFactory.getCurrentSession().delete(administrateur);
        }
		
	}

	@Override
	public void editeAdministrateur(AdministrateurEntity administrateur) {
		
		this.sessionFactory.getCurrentSession().update(administrateur);
        
	}

	@Override
	public AdministrateurEntity getAdministrateurById(Integer administrateurId) {
		AdministrateurEntity administrateur = (AdministrateurEntity) sessionFactory.getCurrentSession().get(
				AdministrateurEntity.class, administrateurId);
		return administrateur;
	}
	
	

}
