package com.yeahbutstill.login;

import com.yeahbutstill.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	// Set the login service - Auto Wiring
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	// jadi menggunakan model untuk meneruskan informasi antara controller dan view
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model, @RequestParam String name,
			@RequestParam String password) {
		if (!service.validateUser(name, password)) {
			model.put("errorMessage", "Invalide Credentials");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);
		return "welcome";

	}
}
