package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.DocumentEntity;
import entity.PlaintEntity;

@Repository
public class DocumentDaoImpl implements DocumentDAO  {

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addDocument(DocumentEntity document) {
		this.sessionFactory.getCurrentSession().save(document);
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentEntity> getAllDocuments() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from DocumentEntity").list();
	}

	@Override
	public void deleteDocument(Integer documentId) {
		DocumentEntity document = (DocumentEntity) sessionFactory.getCurrentSession().load(
				DocumentEntity.class, documentId);
        if (null != document) {
        	this.sessionFactory.getCurrentSession().delete(document);
        }
		
	}

	@Override
	public void editeDocument(DocumentEntity document) {
		
		this.sessionFactory.getCurrentSession().update(document);
        
	}

	@Override
	public DocumentEntity getDocumentById(Integer documentId) {
		DocumentEntity document = (DocumentEntity) sessionFactory.getCurrentSession().get(
				DocumentEntity.class, documentId);
		return document;
	}

	
	
	
	@Override
	public void disponibiliteDocument(Integer documentId) {
		DocumentEntity document = (DocumentEntity) sessionFactory.getCurrentSession().get(
				DocumentEntity.class, documentId);
        if (null != document) {
        	if (document.getDisponibilite()) {
        		document.setDisponibilite(false);
			} else {
				document.setDisponibilite(true);
			}
        	this.sessionFactory.getCurrentSession().update(document);
        }
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int [] nbrNotification() {
		
		int count1 = ((Long)sessionFactory.getCurrentSession().createQuery("select count(*) from ReservationEntity where NOTIFICATION=0").uniqueResult()).intValue();
		int count2 = ((Long)sessionFactory.getCurrentSession().createQuery("select count(*) from ReclamationEntity where NOTIFICATION=0").uniqueResult()).intValue();
		int count3 = ((Long)sessionFactory.getCurrentSession().createQuery("select count(*) from DocumentEntity where NOTIFICATION=0").uniqueResult()).intValue();
		int count4 = ((Long)sessionFactory.getCurrentSession().createQuery("select count(*) from PlaintEntity where NOTIFICATION=0").uniqueResult()).intValue();
		
		int notification[] = {count1,count2,count3,count4};
		return notification;
	}
	
	

}
