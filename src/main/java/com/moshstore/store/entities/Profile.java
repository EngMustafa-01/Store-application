package com.moshstore.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "profile")
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "user_id")
    private Long user_id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "date_of_birth")
    private LocalDate date_of_birth;

    @Column(name = "loyalty_points")
    private int loyalty_points;

}
