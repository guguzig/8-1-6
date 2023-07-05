package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Иван", "Петров", (byte) 22);
        userService.saveUser("Петр", "Иванов", (byte) 25);
        userService.saveUser("Аркадий", "Укупник", (byte) 45);
        userService.saveUser("Семен", "Довлатов", (byte) 30);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
