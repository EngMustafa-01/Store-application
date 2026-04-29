package com.moshstore.store.services;

import com.moshstore.store.entities.Addresses;
import com.moshstore.store.entities.User;
import com.moshstore.store.repositories.UserRepository;
import jakarta.persistence.Cacheable;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityState() {
        var user = User.builder()
                .name("Halwest")
                .email("Halwest@email.com")
                .password("password")
                .build();

        if (entityManager.contains(user))
            System.out.println("User is persistence");
        else
            System.out.println("User is Transient or Detached ");

        userRepository.save(user);

        if (entityManager.contains(user))
            System.out.println("User is persistence");
        else
            System.out.println("User is Transient or Detached ");

    }

    @Transactional
    public void showRelatedEntity() {
        var user = userRepository.findById(3L).orElseThrow();
        System.out.println(user.getEmail());
    }

    public void persistRelated() {
        var user = User.builder()
                .name("name")
                .email("email@emai.com")
                .password("password")
                .build();

        var address = Addresses.builder()
                .state("Erbil")
                .zip("440001")
                .city("Berlin")
                .street("Berlin")
                .build();

        user.addAddresses(address);
        userRepository.save(user);
    }

    public void deleteRelated() {
        userRepository.deleteById(2L);
    }
}
