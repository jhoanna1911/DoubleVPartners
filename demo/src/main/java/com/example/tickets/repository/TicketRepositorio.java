package com.example.tickets.repository;

import com.example.tickets.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepositorio extends JpaRepository<Ticket, Long> {
}
