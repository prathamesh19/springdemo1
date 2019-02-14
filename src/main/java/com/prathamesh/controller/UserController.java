package com.prathamesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping(value="admissionForm.html" , method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView model =new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@RequestMapping(value="submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("userName") String userName){
		
		
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details submitted by you :" + userName);
	
		return model;
	}
}
