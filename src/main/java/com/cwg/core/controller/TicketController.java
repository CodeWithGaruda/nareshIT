package com.cwg.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwg.core.model.Ticket;
import com.cwg.core.service.TicketSerice;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {
	@Autowired
	private TicketSerice service;

	@GetMapping(value = "/all")
	public Iterable<Ticket> getTickets() {
		return service.getTickets();
	}

	@GetMapping(value = "/{id}")
	public Ticket getTicket(@PathVariable("id") Integer id) {
		return service.getTicket(id);
	}

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return service.createTicket(ticket);
	}

	@PutMapping(value = "/{id}/{name}")
	public Ticket updateTicket(@PathVariable("id") Integer id, @PathVariable("name") String name) {
		return service.updateTicket(id, name);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteTicket(@PathVariable("id") Integer id) {
		service.deleteTicket(id);
	}
}
