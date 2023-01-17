package com.shop.bean;

import java.util.List;
import java.util.Map;

public class Shop {
	private int id;
	private String name;
	private List<String> menu;
	private Map<String, Integer> price;

	public Shop() {
		super();
	}

	public Shop(int id, String name, List<String> menu) {
		super();
		this.id = id;
		this.name = name;
		this.menu = menu;
	}

	public Shop(int id, String name, List<String> menu, Map<String, Integer> price) {
		super();
		this.id = id;
		this.name = name;
		this.menu = menu;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}

	public Map<String, Integer> getPrice() {
		return price;
	}

	public void setPrice(Map<String, Integer> price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", menu=" + menu + ", price=" + price + "]";
	}

}
