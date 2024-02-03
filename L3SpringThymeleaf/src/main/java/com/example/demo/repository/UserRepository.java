package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Component
public class UserRepository {
    /**
     * Коллекция для хранения пользователей, работающая в условиях многопоточности
     */
    private Map<Long, User> users = new ConcurrentHashMap<>();

    /**
     * Счетчик ID пользователей
     */
    private AtomicLong counter = new AtomicLong();

    /**
     * @return список всех пользователей
     */
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    /**
     * @param id идентификатор пользователя
     * @return пользователь с указанным ID
     */
    public User findById(Long id) {
        return users.get(id);
    }

    /**
     * Добавление в коллекцию нового пользователя и присвоение ему ID, если ID является null,
     * либо обновление информации о пользователе по его ID.
     * @param user объект пользователя
     * @return объект пользователя с указанным ID
     */
    public User save(User user) {
        if (user.getId() == null) {
            user.setId(counter.incrementAndGet());
        }
        users.put(user.getId(), user);
        return user;
    }

}
