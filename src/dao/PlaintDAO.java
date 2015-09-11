package dao;

import java.util.List;

import entity.PlaintEntity;

public interface PlaintDAO 
{
    public void addPlaint(PlaintEntity plaint);
    public void editePlaint(PlaintEntity plaint);
    public List<PlaintEntity> getAllPlaints();
    public PlaintEntity getPlaintById(Integer plaintId);
    public void deletePlaint(Integer plaintId);
    public void visibilitePlaint(Integer salleId);
    
}