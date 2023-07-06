package app.web.nakama.service;

import java.util.List;

import app.web.nakama.model.User;

public interface IUserService {
    public List<User> getUsers();
    public void saveUser (User user);
    public User findUser (Long id);
}
