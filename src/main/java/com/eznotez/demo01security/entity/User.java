package com.eznotez.demo01security.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private String mail;

    private Integer phone;

    private Boolean enabled;

    private Boolean locked;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Role> roles;


}
