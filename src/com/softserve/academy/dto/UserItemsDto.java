package com.softserve.academy.dto;

import java.util.ArrayList;
import java.util.List;

public class UserItemsDto {
	
	private long userId;
	private List<ItemDTO> itemsList;
	
	public UserItemsDto(long userId, List<ItemDTO> itemsList) {
		this.userId = userId;
		this.itemsList = itemsList;
	}

	public UserItemsDto(long userId) {
		this.userId = userId;
		this.itemsList = new ArrayList<ItemDTO>();
	}

	//getters
	public long getUserId() {
		return userId;
	}

	public List<ItemDTO> getItemsList() {
		return itemsList;
	}

	//setters
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setItemsList(List<ItemDTO> itemsList) {
		this.itemsList = itemsList;
	}
	
	//others
	public void addItemDtoToList(ItemDTO itemDTO) {
		getItemsList().add(itemDTO);
	}
	

}
