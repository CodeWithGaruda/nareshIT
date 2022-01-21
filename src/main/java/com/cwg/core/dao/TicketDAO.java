package com.cwg.core.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cwg.core.model.Ticket;

@Repository
public interface TicketDAO extends CrudRepository<Ticket, Integer> {

}
