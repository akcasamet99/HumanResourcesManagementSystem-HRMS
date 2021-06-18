package sametakcacom.HRMS.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sametakcacom.HRMS.business.abstracts.UserService;
import sametakcacom.HRMS.core.utilities.results.DataResult;
import sametakcacom.HRMS.entities.concretes.User;

@RestController
@RequestMapping("/api/users/")
public class UserControllers {

	private UserService userService;

	public UserControllers(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	@GetMapping("/getall")
	@ResponseBody
	public DataResult<List<User>>  getAll(){
		return this.userService.getAll();
	}
	
}
