package com.example.tickets.service;


import com.example.tickets.model.Ticket;
import com.example.tickets.repository.TicketRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TicketService {
    @Autowired
    private TicketRepositorio ticketRepository;

    public Page<Ticket> getAllTickets(Pageable pageable) {
        return ticketRepository.findAll(pageable);
    }

    public Optional<Ticket> getTicketById(Long id) {
        return ticketRepository.findById(id);
    }

    public Ticket createTicket(Ticket ticket) {
        ticket.setFechaCreacion(LocalDateTime.now());
        ticket.setFechaActualizacion(LocalDateTime.now());
        return ticketRepository.save(ticket);
    }

    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

    public Ticket updateTicket(Long id, Ticket ticketDetails) {
        Ticket ticket = ticketRepository.findById(id).orElseThrow();
        ticket.setUsuario(ticketDetails.getUsuario());
        ticket.setFechaActualizacion(LocalDateTime.now());
        ticket.setEstatus(ticketDetails.getEstatus());
        return ticketRepository.save(ticket);
    }
}
