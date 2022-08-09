package com.learrn.springbootlearnsecurity.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.learrn.springbootlearnsecurity.models.UserModel;

@Service
public class UserServices {
	
	
List<UserModel> list=new ArrayList<>();

	public UserServices() {
		list.add(new UserModel("sourabh","nama","Sourav1999@gmail.com"));
		list.add(new UserModel("nama","123","nama1995@gmail.com"));
	}
// get all users
	
	public List<UserModel> getallUserModels()
	{
	
		return this.list;
	}
	
	//get single user
	public UserModel getuseModel(String username)
	{
		return this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().get();
	}
	
	
	//get new user
	public UserModel addUserModel(UserModel user)
	{
		this.list.add(user);
		return user;
	}
	
		}

	








