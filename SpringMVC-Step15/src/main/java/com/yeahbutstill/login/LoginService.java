package com.yeahbutstill.login;

import org.springframework.stereotype.Service;

// New LoginService()
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("dani") && password.equals("dummy");
	}

}