package dao;

import java.util.List;

import entity.DocumentEntity;

public interface DocumentDAO 
{
    public void addDocument(DocumentEntity document);
    public void editeDocument(DocumentEntity document);
    public List<DocumentEntity> getAllDocuments();
    public DocumentEntity getDocumentById(Integer documentId);
    public void deleteDocument(Integer documentId);
    public void disponibiliteDocument(Integer documentId);
    
    
    public  int []  nbrNotification();
    
}