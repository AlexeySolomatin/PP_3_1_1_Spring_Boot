package ru.solomatin.preproject.springboot.dao;

import org.springframework.stereotype.Repository;
import ru.solomatin.preproject.springboot.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

    public User getUser(int id) {
        return (User) entityManager.createQuery("FROM User WHERE id = :id").setParameter("id", id).getSingleResult();
    }

    public void save(User user) {
        entityManager.persist(user);
    }

    public void update(int id, User updateUser) {
        User userToBeUpdated = getUser(id);
        userToBeUpdated.setFirstName(updateUser.getFirstName());
        userToBeUpdated.setLastName(updateUser.getLastName());
        userToBeUpdated.setEmail(updateUser.getEmail());
    }

    public void delete(int id) {
        entityManager.remove(getUser(id));
    }
}
