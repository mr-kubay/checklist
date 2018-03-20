package com.softserve.academy.services;


import com.softserve.academy.dao.ItemDao;
import com.softserve.academy.dto.ItemDTO;
import com.softserve.academy.entity.ItemEntity;

public class ItemService {

	private ItemDao itemDao;
	
	public ItemService(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	public ItemDTO getItemDto(long id) {
		ItemDTO itemDTO = null;
		ItemEntity itemEntity = itemDao.getById(id);
		if(itemEntity != null) {
			itemDTO = new ItemDTO(itemEntity.getId(), itemEntity.getTitle(), itemEntity.getDescription(), itemEntity.getUserId());
		}
		return itemDTO;
	}
	
	public boolean setItemDto(ItemDTO itemDTO) {
		boolean result = false;
		ItemEntity itemEntity = new ItemEntity(itemDTO.getTitle(),itemDTO.getDescription(),itemDTO.getIdUser());
		itemEntity.setId(itemDTO.getIdItem());

		if(itemDTO.getIdItem()>0) {
			if(isExsistItem(itemEntity.getId())) {
				itemDao.updateById(itemEntity);
				result = true;
			}
			
		}
		return result;
	}
	
	public boolean isExsistItem(long id) {
		return itemDao.getById(id)!=null ? true : false;
	}
}
