package com.softserve.academy.services;

import java.util.List;


import com.softserve.academy.dao.UserDao;
import com.softserve.academy.dto.LoginDTO;
import com.softserve.academy.entity.UserEntity;

public class LoginService {

	private UserDao userDao;
	
	public LoginService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public boolean isLogged(LoginDTO loginDTO) {
		List<UserEntity> usersList ;
		usersList = userDao.getByFieldName("login", loginDTO.getLogin());
		boolean result  = (usersList.size() ==1)&&(usersList.get(0).getPasswd().equals(loginDTO.getPassword()));
		return result;
	}
	
}
