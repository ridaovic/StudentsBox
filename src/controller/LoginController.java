package controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.AdministrateurManager;
import test.Lien;

import com.mysql.jdbc.log.Log;

import entity.AdministrateurEntity;

@Controller
public class LoginController {

//	@RequestMapping("/login")
//    public ModelAndView login(ModelMap model) {
//		
//		ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("message", "Spring security allows you");
//        modelAndView.setViewName("login");
//        return modelAndView;
//     }
// 
//    @RequestMapping("/accessdenied")
//    public String loginerror(ModelMap model) {
//        model.addAttribute("error", "true");
//        return "denied";
//    }
// 
//    @RequestMapping("/logout")
//    public String logout(ModelMap model) {
//        return "logout";
//    }

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Invalid username and password!");
	  }

	  if (logout != null) {
		model.addObject("msg", "You've been logged out successfully.");
	  }
	  model.setViewName("login");

	  return model;

	}
	
	
	
}
