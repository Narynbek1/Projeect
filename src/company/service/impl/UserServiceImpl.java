package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    public void addUser(User user) {
        userDao.getUsers().add(user);
    }
    @Override
    public User getUsersId(int Id) {
        User user = new User();
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (Id == userDao.getUsers().get(i).getId()) {
               user = userDao.getUsers().get(i);
            }else {
                throw new RuntimeException();
            }
        }
        return user;
    }
    @Override
    public void deleteUsers(int Id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (Id == userDao.getUsers().get(i).getId()) {
                userDao.getUsers().remove(userDao.getUsers().get(i));
            }
        }
    }
    @Override
    public ArrayList<User> ollUsers() {
        return userDao.getUsers();
    }
}
