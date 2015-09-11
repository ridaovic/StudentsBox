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

import service.AdministrateurManager;
import service.DocumentManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.AdministrateurEntity;

@Controller
public class AdministrateurController {
	
	@Autowired
	private AdministrateurManager administrateurManager;
	
	@Autowired
	private DocumentManager documentManager;
	
	@RequestMapping(value = "/administrateurs", method = RequestMethod.GET)
	public String listAdministrateurs(ModelMap map) 
	{
		map.addAttribute("lien", "/administrateurs");
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("administrateur", new AdministrateurEntity());
		map.addAttribute("administrateurList", administrateurManager.getAllAdministrateurs());
		
		return "administrateurs";
	}

	
	
	@RequestMapping(value = "/add-admin", method = RequestMethod.GET)
	public String addAdministrateur(ModelMap map) 
	{	
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("lien", "/ajouter_administrateur");
		map.addAttribute("administrateur", new AdministrateurEntity());
		return "ajouter_administrateur";
	}
	
	
	@RequestMapping(value = "/add-admin", method = RequestMethod.POST)
	public String addAdministrateur(@ModelAttribute(value="administrateur") AdministrateurEntity administrateur, BindingResult result) 
	{	
		administrateurManager.addAdministrateur(administrateur);
		return "redirect:/administrateurs";
	}
	
	
	@RequestMapping(value = "update-admin-{administrateurId}", method = RequestMethod.GET)
		public String editAdministrateur(@PathVariable("administrateurId") Integer administrateurId,ModelMap map) 
		{	
			map.addAttribute("nbr", documentManager.nbrNotification());
			AdministrateurEntity a=administrateurManager.getAdministrateurById(administrateurId);
			map.addAttribute("administrateur", a);
			return "update_administrateur";
		}
		
		@RequestMapping(value = "/update-admin", method = RequestMethod.POST)
		public String editAdministrateur(@ModelAttribute(value="administrateur") AdministrateurEntity administrateur, BindingResult result) 
		{	
			administrateurManager.editeAdministrateur(administrateur);
			return "redirect:/administrateurs";
		}
		
	
	
	@RequestMapping("delete-admin/{administrateurId}")
	public String deleteAdministrateur(@PathVariable("administrateurId") Integer administrateurId)
	{
		administrateurManager.deleteAdministrateur(administrateurId);
		return "redirect:/administrateurs";
	}

	
	
	
	
	
	public void setAdministrateurManager(AdministrateurManager administrateurManager) {
		this.administrateurManager = administrateurManager;
	}

}
