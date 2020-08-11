/*
package com.java.kundan.meetup.app.entity.registration;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;


 Event is design to save the event record  

@Data
@Entity
@Table(name="EVENT")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="EVENT_ID")
	private Long eventId;
	
	@Column(name="EVENT_NAME")
	private String eventName;
	
	@Column(name="EVENT_DATE")
	private Date date;
	
	@JoinColumn(name="eVid")
	private EventVanue eventVanue;
	
}*/
