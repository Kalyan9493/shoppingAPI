package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.project.entity.User;
import com.project.repository.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(ApplicationArguments args) {
        userRepository.save(new User("Kalyan", "Reddy", "kalyan@gmail.com", 9493609939L, "1-103/hyderabad", "kalyan", new BCryptPasswordEncoder().encode("1234") ));
    }
}
