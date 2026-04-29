package com.moshstore.store;

import com.moshstore.store.entities.Profile;
import com.moshstore.store.entities.User;
import com.moshstore.store.repositories.AddressRepository;
import com.moshstore.store.repositories.UserRepository;
import com.moshstore.store.services.AddressService;
import com.moshstore.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var service =  context.getBean(UserService.class);

        }

}