package com.cwg.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cwg.core.dao.TicketDAO;
import com.cwg.core.model.Ticket;

@Service
public class TicketSerice {
	@Autowired
	private TicketDAO dao;

	public Ticket getTicket(Integer id) {
		return dao.findById(id).orElse(new Ticket());
	}

	public Iterable<Ticket> getTickets() {
		return dao.findAll();
	}

	public Ticket createTicket(Ticket ticket) {
		return dao.save(ticket);
	}

	public Ticket updateTicket(Integer id, String name) {
		Ticket ticket = getTicket(id);
		ticket.setName(name);
		return dao.save(ticket);
	}

	public void deleteTicket(Integer id) {
		dao.deleteById(id);
	}
}
