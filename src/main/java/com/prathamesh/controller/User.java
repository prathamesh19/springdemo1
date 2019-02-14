package com.prathamesh.controller;

public class User {


private String userName;


@Override
public String toString() {
	return "User [userName=" + userName + "]";
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public User(String userName) {
	super();
	this.userName = userName;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}


}
