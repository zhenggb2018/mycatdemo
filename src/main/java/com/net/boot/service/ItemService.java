package com.net.boot.service;

import java.util.List;

import com.net.boot.model.Item;

public interface ItemService {
	
	public void add(Item i);
	
	List<Item> find();
	
}
