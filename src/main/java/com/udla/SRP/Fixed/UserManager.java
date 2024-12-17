package com.udla.SRP.Fixed;

public class UserManager {
    private final UserValidator userValidator;
    private final UserRepository userRepository;
    private final NotificationService notificationService;
    public UserManager(UserValidator userValidator, UserRepository userRepository, NotificationService notificationService) {
        this.userValidator = userValidator;
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    public void addUser(String email, String password) {
        if (userValidator.isValidEmail(email) && userValidator.isValidPassword(password)) {
            userRepository.saveToDatabase(email, password);
            notificationService.sendWelcomeEmail(email);
        } else {
            System.out.println("User not valid");
        }
    }

}
