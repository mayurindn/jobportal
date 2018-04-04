package wipro.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import wipro.company.model.Login;
import wipro.company.service.LoginService;
import wipro.company.validator.LoginValidator;

@Controller
public class LoginController {

	@Autowired
	LoginValidator validator;
	
	@Autowired
	LoginService service;

	@RequestMapping("/login")

	public String showLogin(Model model) {
		model.addAttribute("login", new Login());
		return "login";

	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("login") Login emp, Model model, BindingResult error) {
		validator.validate(emp, error);

		if (error.hasErrors()) {
			return "login";     
		}
		if(!service.isValidUser(emp))
		{
			error.reject("", "Invalid credentials");
			return "login";
		}
		model.addAttribute("login", emp);
		return "empDetails";
	}

}
