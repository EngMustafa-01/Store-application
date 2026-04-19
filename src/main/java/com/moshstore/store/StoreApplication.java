package com.moshstore.store;

import com.moshstore.store.entities.Addresses;
import com.moshstore.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        var user = User.builder()
                .id(1L)
                .name("Ibrahim")
                .email("ibrahim@gmail.com")
                .password("ibrahim123")
                .build();

        var address = Addresses.builder()
                .city("erbil")
                .zip("41001")
                .state("shorsh")
                .street("haji")
                .build();

        user.getAddresses().add(address);
        System.out.println(user);
    }

}