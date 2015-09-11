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
import service.EtudiantManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.EtudiantEntity;

@Controller
public class EtudiantController {
	
	@Autowired
	private EtudiantManager etudiantManager;
	
	@Autowired
	private DocumentManager documentManager;
	
	@RequestMapping(value = "/etudiants", method = RequestMethod.GET)
	public String listAdministrateurs(ModelMap map) 
	{
		
		map.addAttribute("lien", "/etudiants");
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("etudiant", new EtudiantEntity());
		map.addAttribute("etudiantList", etudiantManager.getAllEtudiants());
		
		return "etudiants";
	}

	
	
	@RequestMapping(value = "/add-etudiant", method = RequestMethod.GET)
	public String addEtudiant(ModelMap map) 
	{	
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("lien", "/ajouter_etudiant");
		map.addAttribute("etudiant", new EtudiantEntity());
		return "ajouter_etudiant";
	}
	
	

	

	@RequestMapping(value = "/add-etudiant", method = RequestMethod.POST)
	public String addEtudiant(@ModelAttribute(value="etudiant") EtudiantEntity etudiant, BindingResult result) 
	{	
		etudiantManager.addEtudiant(etudiant);
		return "redirect:/etudiants";
	}
	
	
	
		@RequestMapping(value = "update-etudiant-{etudiantId}", method = RequestMethod.GET)
		public String editEtudiant(@PathVariable("etudiantId") Integer etudiantId,ModelMap map) 
		{	
			map.addAttribute("nbr", documentManager.nbrNotification());
			EtudiantEntity e=etudiantManager.getEtudiantById(etudiantId);
			map.addAttribute("etudiant", e);
			return "update_etudiant";
		}
		
		@RequestMapping(value = "/update-etudiant", method = RequestMethod.POST)
		public String editEtudiant(@ModelAttribute(value="etudiant") EtudiantEntity etudiant, BindingResult result) 
		{	
			
			etudiantManager.editeEtudiant(etudiant);
			return "redirect:/etudiants";
		}
		
	
	
	@RequestMapping("delete-etudiant/{etudiantId}")
	public String deleteEtudiant(@PathVariable("etudiantId") Integer etudiantId)
	{
		etudiantManager.deleteEtudiant(etudiantId);
		return "redirect:/etudiants";
	}
	
	@RequestMapping("ed-etudiant/{etudiantId}")
	public String edEtudiant(@PathVariable("etudiantId") Integer etudiantId)
	{
		etudiantManager.enableDisableEtudiant(etudiantId);
		return "redirect:/etudiants";
	}
	
	
	
	
	
	public void setEtudiantManager(EtudiantManager etudiantManager) {
		this.etudiantManager = etudiantManager;
	}

}
