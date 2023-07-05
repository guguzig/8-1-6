package jm.task.core.jdbc.service;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();
    public void createUsersTable() {
        userDao.createUsersTable();
        System.out.println("Таблица создана");
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
        System.out.println("Таблица удалена");
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println(name + " добавлен в БД");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        System.out.println("Пользователь с id " + id + " удален из БД");
    }

    public List<User> getAllUsers() {
        List<User> users =  userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
        System.out.println("Таблица очищена");
    }
}
