package task01.service.impl;

import java.sql.SQLException;
import java.util.List;

import task01.dao.UserDao;
import task01.dao.impl.UserDaoImpl;
import task01.domain.User;
import task01.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserServiceImpl() {
		try {
			userDao = new UserDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User create(User user) {
		return userDao.create(user);
	}

	@Override
	public List<User> readAll() {
		return userDao.readAll();
	}

	@Override
	public User read(Integer id) {
		return userDao.read(id);
	}

	@Override
	public User update(User user) {
		return userDao.update(user);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}
	
}