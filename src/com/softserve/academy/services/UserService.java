package com.softserve.academy.services;

import com.softserve.academy.dao.UserDao;
import com.softserve.academy.dto.UserDTO;
import com.softserve.academy.entity.UserEntity;

public class UserService {

	private UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDTO getUserDTO(String value) {
		UserEntity userEntity = userDao.getByFieldName("login", value).get(0);
			return new UserDTO(userEntity.getId(),userEntity.getName(), userEntity.getLogin(), userEntity.getPasswd(), userEntity.getEmail());
	}
	
	public boolean setUserDTO(UserDTO userDTO) {
		boolean result = false;
		UserEntity userEntity = new UserEntity(userDTO.getName(), userDTO.getLogin(),userDTO.getPassword(),userDTO.getEmail());
		userEntity.setId(userDTO.getIdUser());
		if(userDTO.getIdUser()>0) {
			userDao.updateById(userEntity);
			result = true;
		} else if(!isExistLogin(userDTO.getLogin())) {
			userDao.save(userEntity);
			result = true;
		} 
		return result;
		
	}
	
	public boolean isExistLogin(String login) {
		boolean result = true;
		try {
			userDao.getByFieldName("login", login).get(0);
			
		}catch(RuntimeException e) {
			result = false;
			System.out.println("login not found " + e.getMessage());
		}
		return result;
	}


}
