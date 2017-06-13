package com.spring.page.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.page.api.dao.ItemDAO;
import com.spring.page.api.model.Item;

@Service
public class ItemService {

	@Autowired
	private ItemDAO dao;

	public List<Item> getItems(int start, int max) {
		return dao.getItems(start, max);
	}
}
