package company.service;

import company.model.User;

import java.util.ArrayList;

public interface UserService {

     void addUser (User user);
      User getUsersId (int Id) throws Exception;
      void deleteUsers (int Id) throws Exception;
      ArrayList<User> ollUsers ();

}
