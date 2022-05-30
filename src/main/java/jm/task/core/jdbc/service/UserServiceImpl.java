package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao udi = new UserDaoHibernateImpl();


    public void createUsersTable() {
        udi.createUsersTable();
    }

    public void dropUsersTable() {
        udi.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        udi.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        udi.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return udi.getAllUsers();
    }

    public void cleanUsersTable() {
        udi.cleanUsersTable();
    }


}
