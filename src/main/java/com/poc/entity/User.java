package com.poc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
public class User implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1193543173351401386L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(value = "autogenerated id")
	private Integer userId;
	@ApiModelProperty(value = "this is the user name")
	private String userName;
	@ApiModelProperty(value = "this is the user email")
	private String userEmail;
	@ApiModelProperty(value = "this is the user password")
	private String userPassword;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}