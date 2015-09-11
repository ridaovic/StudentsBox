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
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.DocumentEntity;
import entity.PlaintEntity;

@Controller
public class DocumentController {
	
	@Autowired
	private DocumentManager documentManager;
	
	@RequestMapping(value = "/documents", method = RequestMethod.GET)
	public String listDocuments(ModelMap map) 
	{
		
		
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("lien", "/documents");
		map.addAttribute("document", new DocumentEntity());
		map.addAttribute("documentList", documentManager.getAllDocuments());
		
		return "documents";
	}

	
	
	@RequestMapping(value = "/add-document", method = RequestMethod.GET)
	public String addDocument(ModelMap map) 
	{	
		map.addAttribute("lien", "/ajouter_document");
		map.addAttribute("document", new DocumentEntity());
		return "ajouter_document";
	}
	
	

	

	@RequestMapping(value = "/add-document", method = RequestMethod.POST)
	public String addDocument(@ModelAttribute(value="document") DocumentEntity document, BindingResult result) 
	{	
		documentManager.addDocument(document);
		return "redirect:/documents";
	}
	
	
	
		@RequestMapping(value = "update-document-{documentId}", method = RequestMethod.GET)
		public String editDocument(@PathVariable("documentId") Integer documentId,ModelMap map) 
		{	
			DocumentEntity d=documentManager.getDocumentById(documentId);
			map.addAttribute("document", d);
			return "update_document";
		}
		
		@RequestMapping(value = "/update-document", method = RequestMethod.POST)
		public String editDocument(@ModelAttribute(value="document") DocumentEntity document, BindingResult result) 
		{	
			documentManager.editeDocument(document);
			return "redirect:/documents";
		}
		
	
	
	@RequestMapping("delete-document/{documentId}")
	public String deleteDocument(@PathVariable("documentId") Integer documentId)
	{
		documentManager.deleteDocument(documentId);
		return "redirect:/documents";
	}

	
	@RequestMapping("ds-document/{documentId}")
	public String vsDocument(@PathVariable("documentId") Integer documentId)
	{
		documentManager.disponibiliteDocument(documentId);
		return "redirect:/documents";
	}
	
	
	@RequestMapping(value = "info-document-{documentId}", method = RequestMethod.GET)
	public String infoDocument(@PathVariable("documentId") Integer documentId,ModelMap map) 
	{	
		DocumentEntity d=documentManager.getDocumentById(documentId);
		d.setNotification(true);
		documentManager.editeDocument(d);
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("document", d);
		return "info_document";
	}
	
	
//	
//	public void setSalleManager(SalleManager salleManager) {
//		this.salleManager = salleManager;
//	}

}
