import company.dao.UserDao;
import company.model.User;
import company.model.enums.Gender;
import company.service.UserService;
import company.service.impl.UserServiceImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        User user = new User(1, "Naryn", 25, Gender.FEMALE);
        User user1 = new User(2, "Narynbek", 26, Gender.MALE);
        User user2 = new User(3, "Narynbek1", 25, Gender.FEMALE);

        UserService userService = new UserServiceImpl();
        userService.addUser(user);
        userService.addUser(user1);
        userService.addUser(user2);
        System.out.println(userService.ollUsers());

        try {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ArrayList<User> users = new ArrayList<>();
        User[] users1 = new User[]{user, user1, user2};
        UserDao userDao = new UserDao();

    }
}