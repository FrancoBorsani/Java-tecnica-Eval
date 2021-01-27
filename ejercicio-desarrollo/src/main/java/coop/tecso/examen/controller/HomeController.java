package coop.tecso.examen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import coop.tecso.examen.helpers.ViewRouteHelpers;


@Controller
@RequestMapping("/")

public class HomeController {
	
	
	@GetMapping("")
	public String index() {
		return ViewRouteHelpers.INDEX;
	}

}











