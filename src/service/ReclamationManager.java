package service;

import java.util.List;

import entity.ReclamationEntity;

public interface ReclamationManager {
	public void addReclamation(ReclamationEntity reclamation);
	public void editeReclamation(ReclamationEntity reclamation);
    public List<ReclamationEntity> getAllReclamations();
    public List<ReclamationEntity> getAllReclamationsVisible();
    public ReclamationEntity getReclamationById(Integer reclamationId);
    public void deleteReclamation(Integer reclamationId);
    public void visibiliteReclamation(Integer plaintId);
    
}
