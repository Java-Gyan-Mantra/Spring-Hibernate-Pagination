package com.spring.page.api.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.page.api.model.Item;

@Repository
public class ItemDAO {
	@Autowired
	private SessionFactory factory;

	@SuppressWarnings("unchecked")
	public List<Item> getItems(int startIndex, int lastIndex) {
		return factory.openSession().createCriteria(Item.class)
				.setFirstResult(startIndex).setMaxResults(lastIndex).list();
	}

}
