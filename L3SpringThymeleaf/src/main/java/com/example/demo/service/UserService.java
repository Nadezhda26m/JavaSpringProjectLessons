package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        addUsers();
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByID(Long id) {
        return userRepository.findById(id);
    }

    private void addUsers() {
        userRepository.save(new User(null, "Tom", "exam1@ya.ru"));
        userRepository.save(new User(null, "Sam", "exam2@ya.ru"));
        userRepository.save(new User(null, "Kate", "exam3@ya.ru"));
    }
}
