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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import service.DocumentManager;
import service.ReclamationManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.ReclamationEntity;
import entity.ReservationEntity;

@Controller
public class ReclamationController {
	
	@Autowired
	private ReclamationManager reclamationManager;
	
	@Autowired
	private DocumentManager documentManager;
	
	@RequestMapping(value = "/reclamations", method = RequestMethod.GET)
	public String listReclamations(ModelMap map) 
	{
		
		map.addAttribute("lien", "/reclamations");
		
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("reclamation", new ReclamationEntity());
		map.addAttribute("reclamationList", reclamationManager.getAllReclamations());
		
		return "reclamations";
	}

	
	
	@RequestMapping(value = "/add-reclamation", method = RequestMethod.GET)
	public String addReclamation(ModelMap map) 
	{	
		map.addAttribute("lien", "/ajouter_reclamation");
		map.addAttribute("reclamation", new ReclamationEntity());
		return "ajouter_reclamation";
	}
	
	

	

	
	
	
	
	
		@RequestMapping(value = "update-reclamation-{reclamationId}", method = RequestMethod.GET)
		public String editReclamation(@PathVariable("reclamationId") Integer reclamationId,ModelMap map) 
		{	
			ReclamationEntity r=reclamationManager.getReclamationById(reclamationId);
			map.addAttribute("reclamation", r);
			return "update_reclamation";
		}
		
		@RequestMapping(value = "/update-reclamation", method = RequestMethod.POST)
		public String editReclamation(@ModelAttribute(value="reclamation") ReclamationEntity reclamation, BindingResult result) 
		{	
			reclamationManager.editeReclamation(reclamation);
			return "redirect:/reclamations";
		}
		
	
	
	@RequestMapping("delete-reclamation/{reclamationId}")
	public String deleteReclamation(@PathVariable("reclamationId") Integer reclamationId)
	{
		reclamationManager.deleteReclamation(reclamationId);
		return "redirect:/reclamations";
	}

	
	@RequestMapping("vs-reclamation/{reclamationId}")
	public String vsReclamation(@PathVariable("reclamationId") Integer reclamationId)
	{
		reclamationManager.visibiliteReclamation(reclamationId);
		return "redirect:/reclamations";
	}
	
	
	@RequestMapping(value = "info-reclamation-{reclamationId}", method = RequestMethod.GET)
	public String infoReclamation(@PathVariable("reclamationId") Integer reclamationId,ModelMap map) 
	{	
		ReclamationEntity r=reclamationManager.getReclamationById(reclamationId);
		r.setNotification(true);
		reclamationManager.editeReclamation(r);
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("reclamation", r);
		return "info_reclamation";
	}
	
	
//	
//	public void setSalleManager(SalleManager salleManager) {
//		this.salleManager = salleManager;
//	}

}
