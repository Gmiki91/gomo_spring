package com.gomo.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin(origins = "http://localhost:4200")
//@RepositoryRestResource(path="events")
public interface EventRepository extends JpaRepository<Event,Integer> {
}
