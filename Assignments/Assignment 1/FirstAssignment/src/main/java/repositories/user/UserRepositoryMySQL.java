package repositories.user;

import model.User;
import repositories.security.RightsRolesRepository;

import java.sql.Connection;
import java.util.List;

public class UserRepositoryMySQL {

    private final Connection connection;
    private final RightsRolesRepository rightsRolesRepository;

    public UserRepositoryMySQL(Connection connection, RightsRolesRepository rightsRolesRepository) {
        this.connection = connection;
        this.rightsRolesRepository = rightsRolesRepository;
    }

    @Override
    public List<User> findAll(){
        return null;
    }
}
