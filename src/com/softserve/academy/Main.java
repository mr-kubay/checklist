package com.softserve.academy;


import com.mysql.jdbc.Connection;
import com.softserve.academy.dao.ItemDao;
import com.softserve.academy.dao.UserDao;
import com.softserve.academy.dto.LoginDTO;
import com.softserve.academy.entity.ItemEntity;
import com.softserve.academy.entity.UserEntity;
import com.softserve.academy.services.LoginService;



public class Main {

	public static void main(String[] args) {
	
		UserDao userDao = new UserDao();
		/*ItemDao i = new ItemDao();
		ItemEntity ientity = i.getById((long)5);
		UserEntity uentity = u.getById((long)5);
		System.out.println(u.delete(uentity));
		System.out.println(i.delete(ientity));*/
		
		LoginDTO loginDTO = new LoginDTO("login1", "pass1");
		LoginService loginService = new LoginService(userDao);
		
		System.out.println(loginService.isLogged(loginDTO));
		
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