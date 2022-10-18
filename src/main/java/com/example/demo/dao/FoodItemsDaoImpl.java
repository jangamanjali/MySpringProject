package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FoodItems;

@Repository
public class FoodItemsDaoImpl implements FoodItemsDao {
	
	@Autowired
	EntityManager entitymanager;
	
	@Override
	public List<FoodItems> findAll() {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query<FoodItems>query=currentSession.createQuery("select f from FoodItems f",FoodItems.class);
		List<FoodItems> foodlist=query.getResultList();
		return foodlist;
	}

	@Override
	public FoodItems findById(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		return currentSession.get(FoodItems.class,id);
	}

	@Override
	@Transactional
	public void saveorUpdate(FoodItems f) {
		Session currentSession=entitymanager.unwrap(Session.class);
		currentSession.saveOrUpdate(f);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query<FoodItems>query=currentSession.createQuery("delete from FoodItems where id =: id");
		query.setParameter("id", id);
		query.executeUpdate();
	}


}
