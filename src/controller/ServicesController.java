package controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import service.AdministrateurManager;
import service.DocumentManager;
import service.EtudiantManager;
import service.PlaintManager;
import service.ReclamationManager;
import service.ReservationManager;
import service.SalleManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.AdministrateurEntity;
import entity.DocumentEntity;
import entity.EtudiantEntity;
import entity.PlaintEntity;
import entity.ReclamationEntity;
import entity.ReservationEntity;
import entity.SalleEntity;

@Controller
@RequestMapping("/services")
public class ServicesController {
	
	@Autowired
	private AdministrateurManager administrateurManager;
	
	@Autowired
	private EtudiantManager etudiantManager;
	
	@Autowired
	private ReclamationManager reclamationManager;

	@Autowired
	private DocumentManager documentManager;
	
	@Autowired
	private PlaintManager plaintManager;
	 	
	@Autowired
	private ReservationManager reservationManager;
	 
	@Autowired
	private SalleManager salleManager;
	
	
	@RequestMapping(value = "users" , method = RequestMethod.GET)
	 public  @ResponseBody  List<AdministrateurEntity> getAllUsers() {
	  List<AdministrateurEntity> users=administrateurManager.getAllAdministrateurs();
	  return users;
	 }
	
	@RequestMapping(value = "user/{id}", method = RequestMethod.GET)
	 public @ResponseBody AdministrateurEntity getUser(@PathVariable Integer id) {
	   AdministrateurEntity a=administrateurManager.getAdministrateurById(id);
	  return a;
	 }
	
	
	//------------------- Etudiant ------------------------------------------------
	
	@RequestMapping(value = "etudiant/{mail}/{pass}", method = RequestMethod.GET)
	 public @ResponseBody EtudiantEntity getAccount(@PathVariable String mail,@PathVariable String pass) {
		EtudiantEntity e=etudiantManager.getEtudiantByAccount(mail, pass);
	  return e;
	 }
	
	
	//------------------- Reclamation ------------------------------------------------
	

	
	@RequestMapping(value = "reclamations" , method = RequestMethod.GET)
	 public  @ResponseBody  List<ReclamationEntity> getAllReclamationsVisible() {
	  List<ReclamationEntity> reclamations=reclamationManager.getAllReclamationsVisible();
	  return reclamations;
	 }
	
	
	@RequestMapping(value = "reclamation/{id}", method = RequestMethod.GET)
	 public @ResponseBody ReclamationEntity getReclamation(@PathVariable Integer id) {
		ReclamationEntity r= reclamationManager.getReclamationById(id);
	  return r;
	 }
	
	
	@RequestMapping(value = "/add-reclamation/{sujet}/{contenu}/{type}", method = RequestMethod.GET)
	@ResponseBody
	public ReclamationEntity addReclamation(@PathVariable String sujet,@PathVariable String type,@PathVariable String contenu) 
	{	
		ReclamationEntity r=new ReclamationEntity();
		r.setSujet(sujet);
		r.setType(type);
		r.setContenu(contenu);
		r.setNotification(false);
		r.setVisibilite(false);
	
		
		r.setAdmin(administrateurManager.getAdministrateurById(5));
		r.setEtudiant(etudiantManager.getEtudiantById(3));
		
		reclamationManager.addReclamation(r);
		return r;
	}
	
	
	
	//------------------- Plaint ------------------------------------------------
	
	@RequestMapping(value = "plaints" , method = RequestMethod.GET)
	 public  @ResponseBody  List<PlaintEntity> getAllPlaints() {
	  List<PlaintEntity> plaints=plaintManager.getAllPlaints();
	  return plaints;
	 }
	
	
	@RequestMapping(value = "plaint/{id}", method = RequestMethod.GET)
	 public @ResponseBody PlaintEntity getPlaint(@PathVariable Integer id) {
		PlaintEntity p=plaintManager.getPlaintById(id);
	  return p;
	 }
	
	
	@RequestMapping(value = "/add-plaint/{sujet}/{contenu}/{type}", method = RequestMethod.GET)
	@ResponseBody
	public PlaintEntity addPlaint(@PathVariable String sujet,@PathVariable String type,@PathVariable String contenu) 
	{	
		PlaintEntity p=new PlaintEntity();
		p.setSujet(sujet);
		p.setType(type);
		p.setContenu(contenu);
		p.setNotification(false);
		p.setVisibilite(false);
	
		
		p.setAdmin(administrateurManager.getAdministrateurById(5));
		p.setEtudiant(etudiantManager.getEtudiantById(3));
		
		plaintManager.addPlaint(p);
		return p;
	}
	
	
	//------------------- Reservation ------------------------------------------------
	
	
	@RequestMapping(value = "reservations" , method = RequestMethod.GET)
	 public  @ResponseBody  List<ReservationEntity> getAllReservations() {
	  List<ReservationEntity> reservations=reservationManager.getAllReservations();
	  return reservations;
	 }
	
	@RequestMapping(value = "reservation/{id}", method = RequestMethod.GET)
	 public @ResponseBody ReservationEntity getReservation(@PathVariable Integer id) {
		ReservationEntity r=reservationManager.getReservationById(id);
	  return r;
	 }
	
	@RequestMapping(value = "/add-reservation/{debut}/{fin}/{salle}", method = RequestMethod.GET)
	@ResponseBody
	public ReservationEntity addReservation(@PathVariable java.util.Date debut,@PathVariable java.util.Date fin,@PathVariable Integer salle) 
	{	
		ReservationEntity r=new ReservationEntity();
		r.setDebut(debut);
		r.setFin(fin);
		r.setSalle(salleManager.getSalleById(salle));
		r.setNotification(false);
		r.setStatut(false);
		
		r.setAdmin(administrateurManager.getAdministrateurById(5));
		r.setEtudiant(etudiantManager.getEtudiantById(3));
		
		reservationManager.addReservation(r);
		return r;
	}


	
	////------------------- Documents ------------------------------------------------
	
	
	@RequestMapping(value = "documents" , method = RequestMethod.GET)
	 public  @ResponseBody  List<DocumentEntity> getAllDocuments() {
	  List<DocumentEntity> documents=documentManager.getAllDocuments();
	  return documents;
	 }
	
	@RequestMapping(value = "document/{id}", method = RequestMethod.GET)
	 public @ResponseBody DocumentEntity getDocument(@PathVariable Integer id) {
		DocumentEntity d=documentManager.getDocumentById(id);
	  return d;
	 }
	
	
////------------------- Salles ------------------------------------------------
	
	
	@RequestMapping(value = "salles" , method = RequestMethod.GET)
	 public  @ResponseBody  List<SalleEntity> getAllSalles() {
	  List<SalleEntity> salles=salleManager.getAllSalles();
	  return salles;
	 }
	
	@RequestMapping(value = "salle/{id}", method = RequestMethod.GET)
	 public @ResponseBody SalleEntity getSalle(@PathVariable Integer id) {
		SalleEntity s=salleManager.getSalleById(id);
	  return s;
	 }
		
	
	
	
	
		
	
}
