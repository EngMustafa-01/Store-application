package com.moshstore.store;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class InMemomryUserRepository implements UserRepository {

    HashMap<String, User> userAccount = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving user: " +user);
        userAccount.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        return userAccount.getOrDefault(email, null);
    }
}
