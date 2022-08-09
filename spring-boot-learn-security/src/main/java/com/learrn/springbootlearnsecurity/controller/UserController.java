package com.learrn.springbootlearnsecurity.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learrn.springbootlearnsecurity.models.UserModel;
import com.learrn.springbootlearnsecurity.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	
	
	@Autowired
	private UserServices userServices;

	//get users
	@GetMapping
	public List<UserModel> getAllUserModels()
	{
		return this.userServices.getallUserModels();
	}
	
	
	@GetMapping("/{username}")
public UserModel getUserModel(@PathVariable ("username") String username)
		
{
		return this.userServices.getuseModel(username);
}
	@PostMapping("/users")
	public UserModel add(@RequestBody UserModel user)
		{
			return this.userServices.addUserModel(user);
		}
	
	
	}
