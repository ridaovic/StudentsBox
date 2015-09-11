package service;

import java.util.List;

import entity.DocumentEntity;

public interface DocumentManager {
	public void addDocument(DocumentEntity reclamation);
	public void editeDocument(DocumentEntity reclamation);
    public List<DocumentEntity> getAllDocuments();
    public DocumentEntity getDocumentById(Integer documentId);
    public void deleteDocument(Integer documentId);
    public void disponibiliteDocument(Integer documentId);
    
    public int [] nbrNotification(); 
}
