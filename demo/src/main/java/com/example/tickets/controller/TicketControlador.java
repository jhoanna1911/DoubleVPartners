package com.example.tickets.controller;

import com.example.tickets.model.Ticket;
import com.example.tickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/api/tickets")
public class TicketControlador {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public Page<Ticket> getAllTickets(@RequestParam Optional<Integer> page, @RequestParam Optional<Integer> size) {
        Pageable pageable = PageRequest.of(page.orElse(0), size.orElse(10));
        return ticketService.getAllTickets(pageable);
    }

    @GetMapping("/{id}")
    public Optional<Ticket> getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticketDetails) {
        return ticketService.updateTicket(id, ticketDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }
}
