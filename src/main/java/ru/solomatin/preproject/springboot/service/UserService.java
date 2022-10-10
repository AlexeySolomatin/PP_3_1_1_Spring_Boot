package ru.solomatin.preproject.springboot.service;

import org.springframework.transaction.annotation.Transactional;
import ru.solomatin.preproject.springboot.model.User;

import java.util.List;


public interface UserService {
    public List<User> getAllUsers();
    public User getUser(int id);
    public void save(User user);
    public void update(int id, User updateUser);
    public void delete(int id);
}
