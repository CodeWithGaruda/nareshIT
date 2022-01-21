package com.cwg.core;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cwg.core.model.Ticket;
import com.cwg.core.service.TicketSerice;

@SpringBootApplication
public class TbaApplication implements CommandLineRunner {
	@Autowired
	TicketSerice service;

	public static void main(String[] args) {
		SpringApplication.run(TbaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Ticket ticket1 = new Ticket("sanath", "hyderbad", "goa", new Date());
//		service.createTicket(ticket1);
//		Ticket ticket2 = new Ticket("subhash", "hyderbad", "goa", new Date());
//		service.createTicket(ticket2);
//		Ticket ticket3 = new Ticket("aparna", "hyderbad", "goa", new Date());
//		service.createTicket(ticket3);
	}

}
