package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.SalleDAO;
import entity.SalleEntity;

@Service
public class SalleManagerImpl implements SalleManager {
	
	@Autowired
    private SalleDAO salleDAO;
	
	@Override
	@Transactional
	public void addSalle(SalleEntity salle) {
		salleDAO.addSalle(salle);
		
	}

	@Override
	@Transactional
	public List<SalleEntity> getAllSalles() {
		return salleDAO.getAllSalles();
	}

	@Override
	@Transactional
	public void deleteSalle(Integer salleId) {
		salleDAO.deleteSalle(salleId);
		
	}

	public void seSalleDAO(SalleDAO salleDAO) {
		this.salleDAO = salleDAO;
	}

	@Override
	@Transactional
	public void editeSalle(SalleEntity salle) {
		salleDAO.editeSalle(salle);
		
	}

	@Override
	@Transactional
	public SalleEntity getSalleById(Integer salleId) {
		return salleDAO.getSalleById(salleId);
	}
	
	
	@Override
	@Transactional
	public void enableDisableSalle(Integer salleId) {
		salleDAO.enableDisableSalle(salleId);
	}
	
}
