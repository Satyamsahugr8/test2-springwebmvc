package com.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.Employee;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String showMessage() {
	return "index";
	}
	
	@RequestMapping("/employeeForm")
	public String employeeForm(Model model)
	{
		Employee obj = new Employee();
		model.addAttribute("employee",obj);
		return "Employee-Page";
	}
	
	@RequestMapping("/submitForm")
	public String SubmitForm(@Valid @ModelAttribute("employee") Employee obj, BindingResult result) {
		if(result.hasErrors())
			return "Employee-Page";
		return "Confirmation-Page";
	}
	
	
	@RequestMapping("/hey")
	public String showText() {
		return "hey";
	}
}
