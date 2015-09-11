package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PlaintDAO;
import entity.PlaintEntity;

@Service
public class PlaintManagerImpl implements PlaintManager {
	
	@Autowired
    private PlaintDAO plaintDAO;
	
	@Override
	@Transactional
	public void addPlaint(PlaintEntity plaint) {
		plaintDAO.addPlaint(plaint);
		
	}

	@Override
	@Transactional
	public List<PlaintEntity> getAllPlaints() {
		return plaintDAO.getAllPlaints();
	}

	@Override
	@Transactional
	public void deletePlaint(Integer plaintId) {
		plaintDAO.deletePlaint(plaintId);
		
	}

	public void setPlaintDAO(PlaintDAO plaintDAO) {
		this.plaintDAO = plaintDAO;
	}

	@Override
	@Transactional
	public void editePlaint(PlaintEntity plaint) {
		plaintDAO.editePlaint(plaint);
		
	}

	@Override
	@Transactional
	public PlaintEntity getPlaintById(Integer plaintId) {
		return plaintDAO.getPlaintById(plaintId);
	}
	
	
	
	@Override
	@Transactional
	public void visibilitePlaint(Integer plaintId) {
		plaintDAO.visibilitePlaint(plaintId);
	}
	
	
}
