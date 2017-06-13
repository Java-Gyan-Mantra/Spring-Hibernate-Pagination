package com.spring.page.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.page.api.model.Item;
import com.spring.page.api.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService service;

	@RequestMapping("/")
	public String showHome() {
		return "itemView";
	}

	@RequestMapping(value = "/getItems")
	public String searchItems(@RequestParam("first") String first,
			@RequestParam("last") String last, Model model) {
		List<Item> items = service.getItems(Integer.valueOf(first),
				Integer.valueOf(last));
		model.addAttribute("items", items);
		return "itemView";
	}
}
