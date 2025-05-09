package com.rapidin.rapidinApp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "domicilios")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreNegocio;
    private Double precioDomicilio;
    private LocalDate fechaDomicilio;
    @ManyToOne
    @JoinColumn(name = "domiciliario_id", nullable = false)
    @JsonIgnoreProperties("domicilios")
    private Domiciliario domiciliario;
}
