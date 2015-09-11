package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.EtudiantDAO;
import entity.EtudiantEntity;

@Service
public class EtudiantManagerImpl implements EtudiantManager {
	
	@Autowired
    private EtudiantDAO etudiantDAO;
	
	@Override
	@Transactional
	public void addEtudiant(EtudiantEntity etudiant) {
		etudiantDAO.addEtudiant(etudiant);
		
	}

	@Override
	@Transactional
	public List<EtudiantEntity> getAllEtudiants() {
		return etudiantDAO.getAllEtudiants();
	}

	@Override
	@Transactional
	public void deleteEtudiant(Integer etudiantId) {
		etudiantDAO.deleteEtudiant(etudiantId);
		
	}

	public void seEtudiantDAO(EtudiantDAO etudiantDAO) {
		this.etudiantDAO = etudiantDAO;
	}

	@Override
	@Transactional
	public void editeEtudiant(EtudiantEntity etudiant) {
		etudiantDAO.editeEtudiant(etudiant);
		
	}

	@Override
	@Transactional
	public EtudiantEntity getEtudiantById(Integer etudiantId) {
		
		return etudiantDAO.getEtudiantById(etudiantId);
	}

	
	@Override
	@Transactional
	public EtudiantEntity getEtudiantByAccount(String mail,String pass) {
		
		return etudiantDAO.getEtudiantByAccount(mail,pass);
	}
	
	@Override
	@Transactional
	public void enableDisableEtudiant(Integer etudiantId) {
		etudiantDAO.enableDisableEtudiant(etudiantId);
	}
	
	
}
