package com.jamesluty.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@GetMapping()
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@GetMapping("/travel/{location}")
	public String travel(@PathVariable("location") String location) {
		return "Congratulations! You will soon travel to " + location + ".";
	}
	
	@GetMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") Integer num) {
		String output = "";
		if(num%2 == 0) {
			output = "You will take a grand journey in the near future.";
		} else {
			output = "You have enjoyed the fruits of your lable but now is a great time to spend time with family and friends.";
		}
		return output;
	}
}
