package com.example.revision.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProject;
    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String desciption;


    @ManyToMany(mappedBy = "projects",cascade = CascadeType.ALL)
    private Set<User> users = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private Set<Sprint> sprints = new HashSet<>();


}


