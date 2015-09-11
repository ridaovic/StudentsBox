package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.DocumentManager;
import service.SalleManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.SalleEntity;

@Controller
public class SalleController {
	
	@Autowired
	private SalleManager salleManager;
	
	@Autowired
	private DocumentManager documentManager;
	
	@RequestMapping(value = "/salles", method = RequestMethod.GET)
	public String listSalles(ModelMap map) 
	{
		
		map.addAttribute("lien", "/salles");
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("salle", new SalleEntity());
		map.addAttribute("salleList", salleManager.getAllSalles());
		
		return "salles";
	}

	
	
	@RequestMapping(value = "/add-salle", method = RequestMethod.GET)
	public String addEtudiant(ModelMap map) 
	{	
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("lien", "/ajouter_salle");
		map.addAttribute("salle", new SalleEntity());
		return "ajouter_salle";
	}
	
	

	

	@RequestMapping(value = "/add-salle", method = RequestMethod.POST)
	public String addSalle(@ModelAttribute(value="salle") SalleEntity salle, BindingResult result) 
	{	
		salleManager.addSalle(salle);
		return "redirect:/salles";
	}
	
	
	
		@RequestMapping(value = "update-salle-{salleId}", method = RequestMethod.GET)
		public String editSalle(@PathVariable("salleId") Integer salleId,ModelMap map) 
		{	
			map.addAttribute("nbr", documentManager.nbrNotification());
			SalleEntity s=salleManager.getSalleById(salleId);
			map.addAttribute("salle", s);
			return "update_salle";
		}
		
		@RequestMapping(value = "/update-salle", method = RequestMethod.POST)
		public String editSalle(@ModelAttribute(value="salle") SalleEntity salle, BindingResult result) 
		{	
			salleManager.editeSalle(salle);
			return "redirect:/salles";
		}
		
	
	
	@RequestMapping("delete-salle/{salleId}")
	public String deleteSalle(@PathVariable("salleId") Integer salleId)
	{
		salleManager.deleteSalle(salleId);
		return "redirect:/salles";
	}

	
	@RequestMapping("ed-salle/{salleId}")
	public String edSalle(@PathVariable("salleId") Integer salleId)
	{
		salleManager.enableDisableSalle(salleId);
		return "redirect:/salles";
	}
	
	
//	
//	public void setSalleManager(SalleManager salleManager) {
//		this.salleManager = salleManager;
//	}

}
