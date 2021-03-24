import database.DatabaseConnectionFactory;
import repositories.security.RightsRolesRepository;
import repositories.user.UserRepository;
import services.user.AuthenticationService;
import services.user.AuthenticationServiceMySQL;

import java.sql.Connection;

public class ComponentFactory {

    private final AuthenticationService authenticationService;

    private final UserRepository userRepository;
    private final RightsRolesRepository rightsRolesRepository;

    private static ComponentFactory instance;

    private ComponentFactory instance(Boolean componentsForTests){
        if(instance == null){
            instance = new ComponentFactory(componentsForTests);
        }
        return instance;
    }


    public ComponentFactory(Boolean componentsForTests) {
        Connection connection = new DatabaseConnectionFactory().getConnectionWrapper(componentsForTests).getConnection();
        this.authenticationService = authenticationService;
        this.userRepository = userRepository;
        this.rightsRolesRepository = new AuthenticationServiceMySQL(this.userRepository, this.rightsRolesRepository);
    }

    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }

    public UserRepository getUserRepository(){
        return userRepository;
    }

    public RightsRolesRepository getRightsRolesRepository() {
        return rightsRolesRepository;
    }
}
