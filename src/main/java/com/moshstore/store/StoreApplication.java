package com.moshstore.store;

import com.moshstore.store.entities.Addresses;
import com.moshstore.store.entities.Profile;
import com.moshstore.store.entities.Tag;
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

        var profile = Profile.builder()
                        .bio("Bio description").build();

        user.setProfile(profile);

        System.out.println(user);
    }

}