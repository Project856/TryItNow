package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {
	@GetMapping("/save-movie")
	public String formMovie() {
		return "index.html";
	}
	
	@PostMapping("/save-movie")
	@ResponseBody
	public String saveMovie(@RequestParam(name="title") String movieTitle, @RequestParam(name="rate") double movieRate) {
		return movieTitle + " : " + movieRate;
	}

}
