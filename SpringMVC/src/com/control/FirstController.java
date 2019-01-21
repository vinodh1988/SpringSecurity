package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.services.DataService;

@Controller
public class FirstController {
@Autowired
DataService data;

	@RequestMapping("first")
	public String first(ModelMap m){
		m.addAttribute("programmers", data.getProgrammers());
		return "home";
	}

}
