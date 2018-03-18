package com.softserve.academy.entity;


public class UserEntity extends BaseEntity {
	
	private String name;
    private String login;
    private String passwd;
    private String email;
    
    public UserEntity(String name,
			String login, String passwd, String email) {
		this.name = name;
		this.login = login;
		this.passwd = passwd;
		this.email = email;
	}
    

    
    public UserEntity() {
	}



	//getters 
    
	public String getName() {
		return name;
	}

	public String getLogin() {
		return login;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getEmail() {
		return email;
		
	}


	//setters
	
	public void setName(String name) {
		this.name = name;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "UserEntity [name=" + name + ", login=" + login + ", passwd=" + passwd + ", email=" + email + "]";
	}



	



	
    
}
