package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.EtudiantEntity;

@Repository
public class EtudiantDaoImpl implements EtudiantDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addEtudiant(EtudiantEntity etudiant) {
		this.sessionFactory.getCurrentSession().save(etudiant);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EtudiantEntity> getAllEtudiants() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from EtudiantEntity").list();
	}

	@Override
	public void deleteEtudiant(Integer etudiantId) {
		EtudiantEntity etudiant = (EtudiantEntity) sessionFactory.getCurrentSession().load(
				EtudiantEntity.class, etudiantId);
        if (null != etudiant) {
        	this.sessionFactory.getCurrentSession().delete(etudiant);
        }
		
	}

	@Override
	public void editeEtudiant(EtudiantEntity etudiant) {
		
		this.sessionFactory.getCurrentSession().update(etudiant);
        
	}

	@Override
	public EtudiantEntity getEtudiantById(Integer etudiantId) {
		EtudiantEntity etudiant = (EtudiantEntity) sessionFactory.getCurrentSession().get(
				EtudiantEntity.class, etudiantId);
		return etudiant;
	}
	
	
	@Override
	public EtudiantEntity getEtudiantByAccount(String mail,String pass) {
		
		
		return  (EtudiantEntity) this.sessionFactory.getCurrentSession().createQuery("from EtudiantEntity WHERE mail='"+mail+"' AND cin='"+pass+"' and statut=1  ").uniqueResult();

		
	}
	
	
	
	

	@Override
	public void enableDisableEtudiant(Integer etudiantId) {
		EtudiantEntity etudiant = (EtudiantEntity) sessionFactory.getCurrentSession().get(
				EtudiantEntity.class, etudiantId);
        if (null != etudiant) {
        	if (etudiant.getStatut()) {
				etudiant.setStatut(false);
			} else {
				etudiant.setStatut(true);
			}
        	this.sessionFactory.getCurrentSession().update(etudiant);
        }
		
	}
	
	

}
