package com.softserve.academy.dto;

public class UserDTO {
	
	private long idUser;
	private String name;
	private String login;
	private String password;
	private String email;
	
	public UserDTO(long idUser,String name, String login, String password, String email) {
		this.idUser = idUser;
		this.name = name;
		this.login = login;
		this.password = password;
		this.email = email;
	}


	//getters
	public long getIdUser() {
		return idUser;
	}
	
	public String getName() {
		return name;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	//setters
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
