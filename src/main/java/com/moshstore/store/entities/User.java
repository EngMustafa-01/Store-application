package com.moshstore.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false,name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    @Builder.Default

    private List<Addresses> addresses = new ArrayList<>();

    private void addAddresses(Addresses address) {
        addresses.add(address);
        address.setUser(this);
    }

    private void removeAddresses(Addresses address) {
        addresses.remove(address);
        address.setUser(null)   ;
    }


}
