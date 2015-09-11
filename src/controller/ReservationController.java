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
import service.ReservationManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.ReservationEntity;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationManager reservationManager;
	
	@Autowired
	private DocumentManager documentManager;
	
	@RequestMapping(value = "/reservations", method = RequestMethod.GET)
	public String listPlaints(ModelMap map) 
	{
		
		map.addAttribute("lien", "/reservations");
		
		map.addAttribute("nbr", documentManager.nbrNotification());
		map.addAttribute("reservation", new ReservationEntity());
		map.addAttribute("reservationList", reservationManager.getAllReservations());
		
		return "reservations";
	}

	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public String test() 
//	{
//		return "info_reservation";
//	}
	
	@RequestMapping(value = "/add-reservation", method = RequestMethod.GET)
	public String addReservation(ModelMap map) 
	{	
		map.addAttribute("lien", "/ajouter_reservation");
		map.addAttribute("reservation", new ReservationEntity());
		return "ajouter_reservation";
	}
	
	

	

	@RequestMapping(value = "/add-reservation", method = RequestMethod.POST)
	public String addReservation(@ModelAttribute(value="reservation") ReservationEntity reservation, BindingResult result) 
	{	
		reservationManager.addReservation(reservation);
		return "redirect:/reservations";
	}
	
	
	
		@RequestMapping(value = "update-reservation-{reservationId}", method = RequestMethod.GET)
		public String editReservation(@PathVariable("reservationId") Integer reservationId,ModelMap map) 
		{	
			ReservationEntity r=reservationManager.getReservationById(reservationId);
			map.addAttribute("reservation", r);
			return "update_reservation";
		}
		
		@RequestMapping(value = "/update-reservation", method = RequestMethod.POST)
		public String editReservation(@ModelAttribute(value="reservation") ReservationEntity reservation, BindingResult result) 
		{	
			reservationManager.editeReservation(reservation);
			return "redirect:/reservations";
		}
		
	
	
		@RequestMapping("delete-reservation/{reservationId}")
		public String deleteReservation(@PathVariable("reservationId") Integer reservationId)
		{
			reservationManager.deleteReservation(reservationId);
			return "redirect:/reservations";
		}

	
	
		
		
		@RequestMapping("st-reservation/{reservationId}")
		public String stReservation(@PathVariable("reservationId") Integer reservationId)
		{
			reservationManager.validerReservation(reservationId);
			return "redirect:/reservations";
		}
		
	
		
		@RequestMapping(value = "info-reservation-{reservationId}", method = RequestMethod.GET)
		public String infoReservation(@PathVariable("reservationId") Integer reservationId,ModelMap map) 
		{	
			ReservationEntity r=reservationManager.getReservationById(reservationId);
			r.setNotification(true);
			reservationManager.editeReservation(r);
			map.addAttribute("nbr", documentManager.nbrNotification());
			map.addAttribute("reservation", r);
			return "info_reservation";
		}	
//	
//	public void setSalleManager(SalleManager salleManager) {
//		this.salleManager = salleManager;
//	}

}
