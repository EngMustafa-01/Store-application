package com.moshstore.store;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService) {
        this.notificationService = notificationService;
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null)
            throw new IllegalArgumentException("User with this email " + user.getEmail() + " Already exists.");

        userRepository.save(user);
        notificationService.send("Confirmation code is sent to your email.", "Sending confirmation email...");
    }



}
