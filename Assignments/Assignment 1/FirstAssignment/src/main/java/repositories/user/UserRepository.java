package repositories.user;

import model.User;

import javax.management.Notification;
import javax.naming.AuthenticationException;

public interface UserRepository {
    Notification<User> findByUsernameAndPassword(String username, String password) throws AuthenticationException;
}
