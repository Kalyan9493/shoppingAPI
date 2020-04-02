package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name= "user")
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name="uid")
	public Long uid;
	private String firstname;
	private String lastname;
	private String emailid;
	
	private long mobileno;
	private String address; 
	private String username;
	private String password;
	@OneToOne(mappedBy = "product")
	private Cart cart;

	
	public User() {

	}




	public User(String firstname, String lastname, String emailid, long mobileno, String address, String username,
			String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.address = address;
		this.username = username;
		this.password = password;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userid=" + uid + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", mobileno=" + mobileno + ", address=" + address + ", username=" + username + ", password="
				+ password +  "]";
	}

	
}
