package com.registration.soap.service;

public class RegisterUserTO implements java.io.Serializable {
	private java.lang.String firstName;

	private java.lang.String lastName;

	private java.lang.String password;

	private java.lang.String repeatPassword;

	private int slNo;

	private java.lang.String userID;

	public RegisterUserTO() {
	}

	public RegisterUserTO(java.lang.String firstName, java.lang.String lastName, java.lang.String password,
			java.lang.String repeatPassword, int slNo, java.lang.String userID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.repeatPassword = repeatPassword;
		this.slNo = slNo;
		this.userID = userID;
	}

	/**
	 * Gets the firstName value for this User.
	 * 
	 * @return firstName
	 */
	public java.lang.String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the firstName value for this User.
	 * 
	 * @param firstName
	 */
	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the lastName value for this User.
	 * 
	 * @return lastName
	 */
	public java.lang.String getLastName() {
		return lastName;
	}

	/**
	 * Sets the lastName value for this User.
	 * 
	 * @param lastName
	 */
	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the password value for this User.
	 * 
	 * @return password
	 */
	public java.lang.String getPassword() {
		return password;
	}

	/**
	 * Sets the password value for this User.
	 * 
	 * @param password
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	/**
	 * Gets the repeatPassword value for this User.
	 * 
	 * @return repeatPassword
	 */
	public java.lang.String getRepeatPassword() {
		return repeatPassword;
	}

	/**
	 * Sets the repeatPassword value for this User.
	 * 
	 * @param repeatPassword
	 */
	public void setRepeatPassword(java.lang.String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	/**
	 * Gets the slNo value for this User.
	 * 
	 * @return slNo
	 */
	public int getSlNo() {
		return slNo;
	}

	/**
	 * Sets the slNo value for this User.
	 * 
	 * @param slNo
	 */
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	/**
	 * Gets the userID value for this User.
	 * 
	 * @return userID
	 */
	public java.lang.String getUserID() {
		return userID;
	}

	/**
	 * Sets the userID value for this User.
	 * 
	 * @param userID
	 */
	public void setUserID(java.lang.String userID) {
		this.userID = userID;
	}

}
