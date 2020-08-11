package com.java.kundan.meetup.app.entity.registration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="MEETUP_REG")
public class UserRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="MEET_UP_ID")
	private long meetUpID;
	
	@Column(name="FNAME")
	private String firstName;
	
	@Column(name="LNAME")
	private String lastName;
	
	@Column(name="EMAILs")
	private String email;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
}
