package ru.solomatin.preproject.springboot.service;

import org.springframework.transaction.annotation.Transactional;
import ru.solomatin.preproject.springboot.model.User;

import java.util.List;

@Transactional
public interface UserService {
    @Transactional(readOnly = true)
    public List<User> getAllUsers();
    @Transactional(readOnly = true)
    public User getUser(int id);
    public void save(User user);
    public void update(int id, User updateUser);
    public void delete(int id);
}
