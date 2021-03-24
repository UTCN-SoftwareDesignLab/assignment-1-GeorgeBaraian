package database;

import java.util.*;

import static database.Constants.Rights.*;
import static database.Constants.Roles.*;


public class Constants {

    public static class Schemas{
        public static final String PRODUCTION = "bankdb";

        public static final String[] SCHEMA = new String[]{PRODUCTION};
    }

    public static class Tables{
        public static final String CLIENT = "client";
        public static final String USER = "user";
        public static final String ROLE = "role";
        public static final String RIGHT = "right";
        public static final String ROLE_RIGHT = "role_right";
        public static final String USER_ROLE = "user_role";

        public static final String[] ORDERED_TABLES_FOR_CREATION = new String[]{USER, ROLE, RIGHT, ROLE_RIGHT, USER_ROLE, CLIENT};
    }

    public static class Roles{
        public static final String ADMINISTRATOR = "administrator";
        public static final String EMPLOYEE = "employee";
        public static final String CLIENT = "client";

        public static final String[] ROLES = new String[]{ADMINISTRATOR, EMPLOYEE, CLIENT};
    }

    public static class Rights{
        //regarding an employee user
        public static final String CREATE_USER = "create_user";
        public static final String DELETE_USER = "delete_user";
        public static final String UPDATE_USER = "update_user";

        public static final String ADD_CLIENT_INFO = "add_client_info";
        public static final String UPDATE_CLIENT_INFO = "update_client_info";
        public static final String VIEW_CLIENT_INFO = "view_client_info";

        public static final String CREATE_CLIENT_ACCOUNT = "create_client_account";
        public static final String DELETE_CLIENT_ACCOUNT = "delete_client_account";
        public static final String UPDATE_CLIENT_ACCOUNT = "update_client_account";
        public static final String VIEW_CLIENT_ACCOUNT = "view_client_account";

        public static final String TRANSFER_MONEY = "transfer_money";
        public static final String PROCESS_BILLS = "process_bills";

        public static final String[] RIGHTS = new String[]{CREATE_USER, DELETE_USER, UPDATE_USER, ADD_CLIENT_INFO, UPDATE_CLIENT_INFO, VIEW_CLIENT_INFO,
                CREATE_CLIENT_ACCOUNT, DELETE_CLIENT_ACCOUNT, UPDATE_CLIENT_ACCOUNT, VIEW_CLIENT_ACCOUNT, TRANSFER_MONEY, PROCESS_BILLS};
    }

        public static Map<String, List<String>> getRolesRights(){
            Map<String, List<String>> ROLES_RIGHTS = new HashMap<>();
            for(String role: ROLES){
                ROLES_RIGHTS.put(role, new ArrayList<>());
            }
            ROLES_RIGHTS.get(ADMINISTRATOR).addAll(Arrays.asList(CREATE_USER, DELETE_USER, UPDATE_USER));//to add: generating reports on employees

            ROLES_RIGHTS.get(EMPLOYEE).addAll(Arrays.asList(ADD_CLIENT_INFO, UPDATE_CLIENT_INFO, VIEW_CLIENT_INFO,
                    CREATE_CLIENT_ACCOUNT,DELETE_CLIENT_ACCOUNT, UPDATE_CLIENT_ACCOUNT, VIEW_CLIENT_ACCOUNT, TRANSFER_MONEY, PROCESS_BILLS));

            return ROLES_RIGHTS;
        }

}
