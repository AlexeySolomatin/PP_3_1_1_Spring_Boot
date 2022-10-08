package ru.solomatin.preproject.springboot.service;

import org.springframework.stereotype.Service;
import ru.solomatin.preproject.springboot.dao.UserDAO;
import ru.solomatin.preproject.springboot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(int id, User updateUser) {
        userDAO.update(id, updateUser);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
