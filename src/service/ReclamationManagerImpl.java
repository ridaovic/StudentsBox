package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.ReclamationDAO;
import entity.ReclamationEntity;

@Service
public class ReclamationManagerImpl implements ReclamationManager {
	
	@Autowired
    private ReclamationDAO reclamationDAO;
	
	@Override
	@Transactional
	public void addReclamation(ReclamationEntity reclamation) {
		reclamationDAO.addReclamation(reclamation);
		
	}

	@Override
	@Transactional
	public List<ReclamationEntity> getAllReclamations() {
		return reclamationDAO.getAllReclamations();
	}

	@Override
	@Transactional
	public List<ReclamationEntity> getAllReclamationsVisible() {
		return reclamationDAO.getAllReclamationsVisible();
	}
	
	
	
	@Override
	@Transactional
	public void deleteReclamation(Integer reclamationId) {
		reclamationDAO.deleteReclamation(reclamationId);
		
	}

	public void setReclamationDAO(ReclamationDAO reclamationDAO) {
		this.reclamationDAO = reclamationDAO;
	}

	@Override
	@Transactional
	public void editeReclamation(ReclamationEntity reclamation) {
		reclamationDAO.editeReclamation(reclamation);
		
	}

	@Override
	@Transactional
	public ReclamationEntity getReclamationById(Integer reclamationId) {
		return reclamationDAO.getReclamationById(reclamationId);
	}
	
	@Override
	@Transactional
	public void visibiliteReclamation(Integer reclamationId) {
		reclamationDAO.visibiliteReclamation(reclamationId);
	}
	
	
	
	
}
