package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {

    List<User> listUsers();
    void createUser(User user);
    void removeUser(User user);
    User getUserById(int id);
    void updateUser(User user);
}
