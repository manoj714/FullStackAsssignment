package com.form.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationUserService implements RegistrationUserInterface{

	@Autowired
	private RegistrationUserRepo formRepostory;
	@Override
	public int saveUserFormData(RegistrationUser form) {
		// TODO Auto-generated method stub
		
		try {
		 formRepostory.save(form);
		 return 1;
		}
		catch(Exception e) {
			return 0;
		}
	}

}
