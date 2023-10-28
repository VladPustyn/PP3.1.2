package web.springmvc.service;


import web.springmvc.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User getUser(int id);

    void update(int id, User updateUser);
    void delete(int id);
}
