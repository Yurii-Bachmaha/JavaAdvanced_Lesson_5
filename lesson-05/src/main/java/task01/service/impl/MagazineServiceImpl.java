package task01.service.impl;

import java.sql.SQLException;
import java.util.List;

import task01.dao.MagazineDao;
import task01.dao.impl.MagazineDaoImpl;
import task01.domain.Magazine;
import task01.service.MagazineService;

public class MagazineServiceImpl implements MagazineService {

	private MagazineDao magazineDao;

	public MagazineServiceImpl() {
		try {
			magazineDao = new MagazineDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Magazine create(Magazine magazine) {
		return magazineDao.create(magazine);
	}

	@Override
	public List<Magazine> readAll() {
		return magazineDao.readAll();
	}

	@Override
	public Magazine read(Integer id) {
		return magazineDao.read(id);
	}

	@Override
	public Magazine update(Magazine magazine) {
		return magazineDao.update(magazine);
	}

	@Override
	public void delete(Integer id) {
		magazineDao.delete(id);
	}

}