package com.example.tickets.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
    @SequenceGenerator(name = "ticket_seq", sequenceName = "TICKET_SEQ", allocationSize = 1)
    private Long id;

    @NotBlank(message = "El usuario no puede estar en blanco")
    private String usuario;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime fechaCreacion;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime fechaActualizacion;

    @NotBlank(message = "El estatus no puede estar en blanco")
    private String estatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
