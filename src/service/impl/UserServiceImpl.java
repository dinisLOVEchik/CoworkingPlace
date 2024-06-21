package service.impl;

import service.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserServiceImpl {
    private List<User> users = new ArrayList<>();

    public UserServiceImpl(List<User> users) {
        this.users = users;
    }

    public String createUser(User user){
        users.add(user);
        return "Пользователь " + user.getLogin() + " успешно добавлен.";
    }

    public User getUser(Long id){
        for (User user : users){
            if (user.getId().equals(id))
                return user;
        }
        return null;
    }
    public void deleteUser(Long id){
        users.removeIf(user -> user.getId().equals(id));
    }
}
