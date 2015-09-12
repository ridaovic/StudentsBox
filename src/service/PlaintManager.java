package service;

import java.util.List;

import entity.PlaintEntity;
import entity.ReclamationEntity;

public interface PlaintManager {
	public void addPlaint(PlaintEntity plaint);
	public void editePlaint(PlaintEntity plaint);
    public List<PlaintEntity> getAllPlaints();
    public List<PlaintEntity> getAllPlaintsVisible();
    public PlaintEntity getPlaintById(Integer plaintId);
    public void deletePlaint(Integer plaintId);
    public void visibilitePlaint(Integer plaintId);
    
}
