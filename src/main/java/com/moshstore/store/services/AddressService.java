package com.moshstore.store.services;

import com.moshstore.store.entities.Addresses;
import com.moshstore.store.entities.User;
import com.moshstore.store.repositories.AddressRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class AddressService {
    private final AddressRepository addressRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityState() {
        var address = Addresses.builder()
                .state("Erbil")
                .zip("440001")
                .city("Berlin")
                .street("Berlin")
                .build();

        if (entityManager.contains(address))
            System.out.println("Address is persistence");
        else
            System.out.println("Address is Transient / Detached");

        addressRepository.save(address);

        if (entityManager.contains(address))
            System.out.println("Address is persistence");
        else
            System.out.println("Address is Transient / Detached");
    }
    @Transactional
    public void showRelatedEntity() {
        var user = addressRepository.findById(3L).orElseThrow();
        //System.out.println(user.getUser().getEmail());
    }


}
