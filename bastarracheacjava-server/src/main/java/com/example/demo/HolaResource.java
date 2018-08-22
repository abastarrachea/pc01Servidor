package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/search/server")
public class HolaResource {
	
	
	@GetMapping
	@RequestMapping("/{id}")
	public String search(@PathVariable("id") String id) {
		String result = "";
		switch(id)
        {
            case "1":
                result = "Abner Ismael Bastarrachea Rosas";
                break;
            case "2":
            	result = "Joel Cuya";
                break;
            case "3":
            	result = "Angel Velasquez";
                break;
            default:
            	result = "Usuario no encontrado";
        }
		return result;
	}
}
