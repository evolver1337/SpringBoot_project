package vitaliikondrashov.springboot_project.service;

import vitaliikondrashov.springboot_project.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);
    List<User> findAll();
    Optional<User> findById(int id);
    void updateUser(User user);
    void deleteById(int id);
}
