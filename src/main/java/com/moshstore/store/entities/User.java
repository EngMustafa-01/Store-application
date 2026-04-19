package com.moshstore.store.entities;

import jakarta.persistence.*;
import jdk.jfr.Timespan;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    @OneToOne

    private Profile profile;


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

    @ManyToMany
    @JoinTable(
            name = "user_tags",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )

    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    public void addTags(String tagss) {
        var tag = new Tag(tagss);
        tags.add(tag);
        tag.getUsers().add(this);
    }

}
