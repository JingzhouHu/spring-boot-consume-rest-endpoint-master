package com.example.demo;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userManager {
	
	@GetMapping("/login")
	public ModelAndView getTeams() {
		ModelAndView demo= new ModelAndView("loginIndex");
		return demo;
	}

	@PostMapping("login")
	public ModelAndView handleLogin(
			@RequestParam("userID") String userID ,		
			@RequestParam("userName") String userName ,
			HttpSession session
			) {
		System.out.println(userID + userName);
		session.setAttribute("userID", userID);
		return new ModelAndView("redirect:/teams");
	}

}

