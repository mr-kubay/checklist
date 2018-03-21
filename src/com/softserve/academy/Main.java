package com.softserve.academy;


import java.awt.ItemSelectable;

import com.mysql.jdbc.Connection;
import com.softserve.academy.dao.ItemDao;
import com.softserve.academy.dao.UserDao;
import com.softserve.academy.dto.ItemDTO;
import com.softserve.academy.dto.LoginDTO;
import com.softserve.academy.dto.UserDTO;
import com.softserve.academy.dto.UserItemsDto;
import com.softserve.academy.entity.ItemEntity;
import com.softserve.academy.entity.UserEntity;
import com.softserve.academy.services.ItemService;
import com.softserve.academy.services.LoginService;
import com.softserve.academy.services.UserItemsService;
import com.softserve.academy.services.UserService;



public class Main {

	public static void main(String[] args) {
	
		UserDao userDao = new UserDao();
		ItemDao itemDao = new ItemDao();
		ItemService itemService = new ItemService(itemDao);
		UserService userService = new UserService(userDao);
		/*ItemDao i = new ItemDao();
		ItemEntity ientity = i.getById((long)5);
		System.out.println(u.delete(uentity));
		System.out.println(i.delete(ientity));*/
		ItemDTO itemDTO = itemService.getItemDto((long)3);
		UserDTO userDTO = userService.getUserDTO("login1");
		
		System.out.println(userDTO);
		LoginDTO login = new LoginDTO("login1", "asd");
		UserItemsService userItemsService = new UserItemsService(userDao, itemDao);
		userItemsService.getUserItems(login);
		

		
	}

}











/*public static void createTable() {
	try {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		conn = DriverManager.getConnection(url, user,pass);
		Statement st = conn.createStatement();
		st.execute("create database db304");
	} catch(SQLException e) {
		e.printStackTrace();
	}
}*/