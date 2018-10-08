package com.form.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationUserController {

	@Autowired
	private RegistrationUserService service;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/registerUser")
	@ResponseBody
	public SuccessPOJO saveUserForm(@RequestBody RegistrationUser formData) {
		 SuccessPOJO success = new SuccessPOJO();
		int i = service.saveUserFormData(formData);
		if(i == 1) {
			success.setMessage("success");
		}
		else {
			success.setMessage("error");
		}
		
		return success;
	}
		
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/registerUserFailBack")
	@ResponseBody
	public SuccessPOJO saveUserFormH(@RequestBody RegistrationUser formData) {
		 formData = validateFormData(formData);
		 SuccessPOJO success = new SuccessPOJO();
		int i = service.saveUserFormData(formData);
		if(i == 1) {
			success.setMessage("success");
		}
		else {
			success.setMessage("error");
		}
		
		return success;
	}
	
	public RegistrationUser validateFormData(RegistrationUser data) {
		
		if(data.getAddress().length() > 255) {
			data.setAddress(null);
		}
		if(data.getName().length() > 255) {
			data.setName(null);
		}
		if(data.getPassword().length() > 255) {
			data.setPassword(null);
		}
		if(data.getCity().length() > 255) {
			data.setCity(null);
		}
		if(data.getZipCode().length() > 255) {
			data.setZipCode(null);
		}
		return data;
	}
	}
