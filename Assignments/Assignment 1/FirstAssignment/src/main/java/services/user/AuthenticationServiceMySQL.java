package services.user;

import repositories.security.RightsRolesRepository;
import repositories.user.UserRepository;

public class AuthenticationServiceMySQL implements AuthenticationService{

    private final UserRepository userRepository;
    private final RightsRolesRepository rightsRolesRepository;

    public AuthenticationServiceMySQL(UserRepository userRepository, RightsRolesRepository rightsRolesRepository) {
        this.userRepository = userRepository;
        this.rightsRolesRepository = rightsRolesRepository;
    }
}
