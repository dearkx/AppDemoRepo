package com.java.kundan.meetup.event.app.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="EVENT_VENUE")
@EqualsAndHashCode
public class EventVanue implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="EV_ID")
	private Long eVid;
	
	@Column(name="EVENT_PLACE",unique=true)
	private String eventPlace;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,targetEntity=Event.class,mappedBy="eventVanue")
	@JsonManagedReference
	private List<Event> event;

}
