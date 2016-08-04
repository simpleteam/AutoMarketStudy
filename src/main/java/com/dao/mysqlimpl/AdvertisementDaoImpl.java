package com.dao.mysqlimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdvertisementDao;
import com.entity.Advertisement;

@Repository
@Transactional
public class AdvertisementDaoImpl extends Dao implements AdvertisementDao {

	public void add(Advertisement advertisement) {
		getSession().save(advertisement);
	}

	public void delete(Advertisement advertisement) {
		getSession().delete(advertisement);
	}

	public Advertisement get(int id) {
		return getSession().get(Advertisement.class, id);
	}

	public void update(Advertisement advertisement) {
		getSession().update(advertisement);
	}

	@SuppressWarnings("unchecked")

	public List<Advertisement> getAll() {
		return getSession().createQuery("from Advertisement").list();
	}

	@SuppressWarnings("unchecked")

	public List<Advertisement> getAllByModel(int modelId) {
		return getSession().createQuery("from Advertisement a where a.model = :model")
				.setInteger("model", new Integer(modelId))
				.list();
	}

	@SuppressWarnings("unchecked")

	public List<Advertisement> getAllByPrice(double minPrice, double maxPrice) {
		return getSession().createQuery("from Advertisement a where a.price >= :minPrice and a.price <= :maxPrice")
				.setDouble("minPrice", minPrice)
				.setDouble("maxPrice", maxPrice)
				.list();
	}

	@SuppressWarnings("unchecked")

	public List<Advertisement> getAllByModelAndPrice(int modelId, double minPrice, double maxPrice) {
		return getSession()
				.createQuery("from Advertisement a where a.price >= :minPrice and a.price <= :maxPrice and a.model.id = :model")
				.setDouble("minPrice", minPrice)
				.setDouble("maxPrice", maxPrice)
				.setInteger("model", modelId)
				.list();
	}

	@SuppressWarnings("unchecked")

	public List<Advertisement> getAllByModelAndYear(int modelId, int minYear, int maxYear) {
		return getSession()
				.createQuery("from Advertisement a where a.model.id = :modelId and a.year >= :minYear and a.year <= :maxYear")
				.setInteger("modelId", modelId)
				.setInteger("minYear", minYear)
				.setInteger("maxYear", maxYear)
				.list();
	}

	@SuppressWarnings("unchecked")

	public List<Advertisement> getAllByModelAndCity(int modelId, int cityId) {
		return getSession().createQuery("from Advertisement a where a.model.id = :modelId and a.user.city.id =:cityId")
				.setInteger("modelId", modelId)
				.setInteger("cityId", cityId)
				.list();
	}

	@SuppressWarnings("unchecked")
	public List<Advertisement> getAllByModelAndUser(int modelId, int userId) {
		return getSession().createQuery("from Advertisement a where a.model.id = :modelId and a.user.id = :userId")
				.setInteger("modelId", modelId)
				.setInteger("userId", userId)
				.list();
	}

	@SuppressWarnings("unchecked")
	public List<Advertisement> getAllbyModelAndPriceAndYear(int modelId, double minPrice, double maxPrice, int minYear, int maxYear) {
		return getSession().createQuery("from Advertisement a where a.model.id = :modelId and a.price >= :minPrice and a.price <= :maxPrice and a.year >= :minYear and a.year >= :maxYear")
				.setInteger("modelId", modelId)
				.setDouble("minPrice", minPrice)
				.setDouble("maxPrice", maxPrice)
				.setInteger("minYear", minYear)
				.setInteger("maxYear", maxYear)
				.list();
	}

	public List<Advertisement> getAllbyModelAndPriceAndCity(int modelId, double minPrice, double maxPrice, int cityId) {
		return null;
	}

	public List<Advertisement> getAllbyModelAndPriceAndYearAndCity(int modelId, double minPrice, double maxPrice,
			int minYear, int maxYear, int cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllByPriceAndYear(double minPrice, double maxPrice, int minYear, int maxYear) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllByPriceAndCity(double minPrice, double maxPrice, int cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllByPriceAndUser(double minPrice, double maxPrice, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllbyPriceAndYearAndCity(double minPrice, double maxPrice, int minYear, int maxYear,
			int cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllByYear(int minYear, int maxYear) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllByYearAndCity(int minYear, int maxYear, int cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllByCity(int cityId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Advertisement> getAllByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
