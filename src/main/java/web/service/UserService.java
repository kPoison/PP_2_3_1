package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAll();
    public User getById(Long id);
    public void save(User user);
    public void update(User user);
    public void delete(Long id);
}
