package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String phoneNumber;
    private String accountAddress;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable( name = "account_role"
            , joinColumns = {@JoinColumn(name = "account_id")}
            , inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    List<Role> roles;

}
