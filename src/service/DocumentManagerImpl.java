package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.DocumentDAO;
import entity.DocumentEntity;

@Service
public class DocumentManagerImpl implements DocumentManager {
	
	@Autowired
    private DocumentDAO documentDAO;
	
	@Override
	@Transactional
	public void addDocument(DocumentEntity document) {
		documentDAO.addDocument(document);
		
	}

	@Override
	@Transactional
	public List<DocumentEntity> getAllDocuments() {
		return documentDAO.getAllDocuments();
	}

	@Override
	@Transactional
	public void deleteDocument(Integer documentId) {
		documentDAO.deleteDocument(documentId);
		
	}

	public void setDocumentDAO(DocumentDAO documentDAO) {
		this.documentDAO = documentDAO;
	}

	@Override
	@Transactional
	public void editeDocument(DocumentEntity document) {
		documentDAO.editeDocument(document);
		
	}

	@Override
	@Transactional
	public DocumentEntity getDocumentById(Integer documentId) {
		return documentDAO.getDocumentById(documentId);
	}

	
	
	@Override
	@Transactional
	public void disponibiliteDocument(Integer documentId) {
		documentDAO.disponibiliteDocument(documentId);
	}
	
	
	
	@Override
	@Transactional
	public int [] nbrNotification() {

		return documentDAO.nbrNotification();
				
	}
	
	
}
