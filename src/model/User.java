package model;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3666598432895484115L;
	
	private String name;
	private String password;
	
	public User(String userName, String userPass){
		name = userName;
		password = userPass;
	}
	
	public String getUserName(){
		return name;
	}

	public String getUserPasswordn(){
		return password;
	}
}
