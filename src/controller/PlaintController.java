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
import service.PlaintManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.PlaintEntity;
import entity.ReclamationEntity;

@Controller
public class PlaintController {
	
	@Autowired
	private PlaintManager plaintManager;
	
	@Autowired
	private DocumentManager documentManager;
	
	@RequestMapping(value = "/plaints", method = RequestMethod.GET)
	public String listPlaints(ModelMap map) 
	{
		
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("lien", "/plaints");
		map.addAttribute("plaint", new PlaintEntity());
		map.addAttribute("plaintList", plaintManager.getAllPlaints());
		
		return "plaints";
	}

	
	
	@RequestMapping(value = "/add-plaint", method = RequestMethod.GET)
	public String addPlaint(ModelMap map) 
	{	
		map.addAttribute("lien", "/ajouter_plaint");
		map.addAttribute("plaint", new PlaintEntity());
		return "ajouter_plaint";
	}
	
	

	

	@RequestMapping(value = "/add-plaint", method = RequestMethod.POST)
	public String addPlaint(@ModelAttribute(value="plaint") PlaintEntity plaint, BindingResult result) 
	{	
		plaintManager.addPlaint(plaint);
		return "redirect:/plaints";
	}
	
	
	
		@RequestMapping(value = "update-plaint-{plaintId}", method = RequestMethod.GET)
		public String editPlaint(@PathVariable("plaintId") Integer plaintId,ModelMap map) 
		{	
			PlaintEntity p=plaintManager.getPlaintById(plaintId);
			map.addAttribute("plaint", p);
			return "update_plaint";
		}
		
		@RequestMapping(value = "/update-plaint", method = RequestMethod.POST)
		public String editPlaint(@ModelAttribute(value="plaint") PlaintEntity plaint, BindingResult result) 
		{	
			plaintManager.editePlaint(plaint);
			return "redirect:/plaints";
		}
		
	
	
	@RequestMapping("delete-plaint/{plaintId}")
	public String deletePlaint(@PathVariable("plaintId") Integer plaintId)
	{
		plaintManager.deletePlaint(plaintId);
		return "redirect:/plaints";
	}
	
	@RequestMapping("vs-plaint/{plaintId}")
	public String vsPlaint(@PathVariable("plaintId") Integer plaintId)
	{
		plaintManager.visibilitePlaint(plaintId);
		return "redirect:/plaints";
	}
	
	
	@RequestMapping(value = "info-plaint-{plaintId}", method = RequestMethod.GET)
	public String infoPlaint(@PathVariable("plaintId") Integer plaintId,ModelMap map) 
	{	
		PlaintEntity p=plaintManager.getPlaintById(plaintId);
		p.setNotification(true);
		plaintManager.editePlaint(p);
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("plaint", p);
		return "info_plaint";
	}
	
	
	
	
//	
//	public void setSalleManager(SalleManager salleManager) {
//		this.salleManager = salleManager;
//	}

}
