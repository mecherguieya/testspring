package com.example.revision.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@Table(name = "sprint")
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSprint;
    @Column(name = "description")
    private String description;
    @Column(name = "startDate")
    private LocalDate startDate; //JJ/MM/YYYY
    @ManyToOne
    @JsonIgnore
    Project project;

}
