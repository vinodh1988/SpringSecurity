package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Jobs;
import com.model.JobsDAO;

@Controller
public class ZeroController {

@Autowired
     JobsDAO jdao;

@Autowired 
	 Jobs jobs;

	@RequestMapping("/hello")
	public String hello(){
		return "home";
	}
	

	@RequestMapping("/jobs")
	public String loadJobs(ModelMap m){
		m.addAttribute("jlist",jdao.getJobs());
		return "report";
	}
	
	@RequestMapping("/addJobs")
	public ModelAndView addJobs(){
		
		
		return new ModelAndView("form","job",jobs);
	}
	
	@RequestMapping(value="/store",method=RequestMethod.POST)
	public String storeJobs(@ModelAttribute("job")Jobs job){
		try{
		if(jdao.addJob(job))
			
			return "redirect:jobs.asp";
		
		
			return  "redirect:addJobs.asp";
		}
		catch(Exception e){
			return  "redirect:addJobs.asp";
		}
		
	}
	
}
