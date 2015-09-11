package service;

import java.util.List;

import entity.EtudiantEntity;

public interface EtudiantManager {
	public void addEtudiant(EtudiantEntity etudiant);
	public void editeEtudiant(EtudiantEntity etudiant);
    public List<EtudiantEntity> getAllEtudiants();
    public EtudiantEntity getEtudiantById(Integer etudiantId);
    public EtudiantEntity getEtudiantByAccount(String mail,String pass);
    public void deleteEtudiant(Integer etudiantId);
    public void enableDisableEtudiant(Integer etudiantId);
     
}
