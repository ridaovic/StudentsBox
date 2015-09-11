package dao;

import java.util.List;

import entity.SalleEntity;

public interface SalleDAO 
{
    public void addSalle(SalleEntity salle);
    public void editeSalle(SalleEntity salle);
    public List<SalleEntity> getAllSalles();
    public SalleEntity getSalleById(Integer salleId);
    public void deleteSalle(Integer salleId);
    public void enableDisableSalle(Integer salleId);
    
}