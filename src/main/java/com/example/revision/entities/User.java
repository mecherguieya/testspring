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
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "email")
    private String email;
    @Column(name = "pwd")
    private String pwd;

    @Column(name = "fName")
    private long fName;

    @Column(name = "IName")
    private String IName;

    @Column(name = "role")
    private Role role;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Project> projects = new HashSet<>();
}
