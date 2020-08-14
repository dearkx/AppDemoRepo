package com.java.kundan.meetup.event.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.kundan.meetup.event.app.entity.EventVanue;

@Repository
public interface EventVanueRepository extends JpaRepository<EventVanue, Long> {
	public EventVanue findByEventPlace(String placeName);
}
