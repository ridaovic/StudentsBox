package dao;

import java.util.List;

import entity.ReclamationEntity;

public interface ReclamationDAO 
{
    public void addReclamation(ReclamationEntity reclamation);
    public void editeReclamation(ReclamationEntity reclamation);
    public List<ReclamationEntity> getAllReclamations();
    public List<ReclamationEntity> getAllReclamationsVisible();
    public ReclamationEntity getReclamationById(Integer reclamationId);
    public void deleteReclamation(Integer reclamationId);
    public void visibiliteReclamation(Integer reclamationId);
    
}