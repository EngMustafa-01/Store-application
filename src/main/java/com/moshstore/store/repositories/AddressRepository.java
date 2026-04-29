package com.moshstore.store.repositories;

import com.moshstore.store.entities.Addresses;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Addresses, Long> {
}
