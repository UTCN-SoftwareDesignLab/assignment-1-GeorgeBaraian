package services.user;

import model.User;

import javax.management.Notification;
import javax.naming.AuthenticationException;

public interface AuthenticationService {


    Notification<User> login(String username, String password) throws AuthenticationException;
}
