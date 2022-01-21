package com.cwg.core.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticketId;
	private String name;
	private String source;
	private String destination;
	private Date date;

	public Integer getTicketId() {
		return ticketId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Ticket(String name, String source, String destination, Date date) {
		super();
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.date = date;
	}

	public Ticket() {

	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", date=" + date + "]";
	}

}
