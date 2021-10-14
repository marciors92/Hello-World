package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class helloworld {
	
	@GetMapping
	public String hello() {
		return "persistência: meu objetivo de aprendizagem foi mentalidade de crescimento";
	}

}
