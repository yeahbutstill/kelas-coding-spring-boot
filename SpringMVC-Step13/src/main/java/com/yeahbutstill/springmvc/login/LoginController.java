package com.yeahbutstill.springmvc.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// Jadi jika kita ingin pergi ke halaman login saya harus menghapus @ResponseBody karen saya tidak ingin login dicetak pada layar
//	@ResponseBody
	public String showLoginPage() {
		return "login";
	}
}
