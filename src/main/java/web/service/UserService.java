package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    void removeUser(User user);
    User getUserById(int id);
    void updateUser(User user);
}
