package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.AdministrateurDAO;
import entity.AdministrateurEntity;

@Service
public class AdministrateurManagerImpl implements AdministrateurManager {
	
	@Autowired
    private AdministrateurDAO administrateurDAO;
	
	@Override
	@Transactional
	public void addAdministrateur(AdministrateurEntity administrateur) {
		administrateurDAO.addAdministrateur(administrateur);
		
	}

	@Override
	@Transactional
	public List<AdministrateurEntity> getAllAdministrateurs() {
		return administrateurDAO.getAllAdministrateurs();
	}

	@Override
	@Transactional
	public void deleteAdministrateur(Integer administrateurId) {
		administrateurDAO.deleteAdministrateur(administrateurId);
		
	}

	public void setAdministrateurDAO(AdministrateurDAO administrateurDAO) {
		this.administrateurDAO = administrateurDAO;
	}

	@Override
	@Transactional
	public void editeAdministrateur(AdministrateurEntity administrateur) {
		administrateurDAO.editeAdministrateur(administrateur);
		
	}

	@Override
	@Transactional
	public AdministrateurEntity getAdministrateurById(Integer administrateurId) {
		
		return administrateurDAO.getAdministrateurById(administrateurId);
	}
	
	
}
