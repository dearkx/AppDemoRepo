/*
package com.java.kundan.meetup.app.entity.registration;

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

import lombok.Data;

@Data
@Entity
@Table(name="EVENT_VANUE")
public class EventVanue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="EVID")
	private Long eVid;
	
	@Column(name="EVENT_PLACE")
	private String eventPlace;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="eventVanue")
	private List<Event> event;

}*/
