package com.amigos.security.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;


    private String name;
    private String username;
    private String password;

//    @ManyToMany(fetch = EAGER)
//    private Collection<Role> roles = new ArrayList<>();

    @ManyToMany(fetch = EAGER)
    private Set<Role> roles;
}
