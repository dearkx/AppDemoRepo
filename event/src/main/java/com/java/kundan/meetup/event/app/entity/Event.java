package com.java.kundan.meetup.event.app.entity;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@Table(name="EVENT")
@EqualsAndHashCode
public class Event implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="EVENT_ID")
	private Long eventId;
	
	@Column(name="EVENT_NAME")
	private String eventName;
	
	@Column(name="EVENT_DATE")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;

	@Column(name="EVENT_DESCRIPTION")
	private String eventDescription;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="EV_ID",referencedColumnName="EV_ID")
	@JsonBackReference
	private EventVanue eventVanue;
	
}
