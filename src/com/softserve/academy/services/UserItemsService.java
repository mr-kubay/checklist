package com.softserve.academy.services;

import java.util.List;

import com.softserve.academy.dao.ItemDao;
import com.softserve.academy.dao.UserDao;
import com.softserve.academy.dto.ItemDTO;
import com.softserve.academy.dto.LoginDTO;
import com.softserve.academy.dto.UserDTO;
import com.softserve.academy.dto.UserItemsDto;
import com.softserve.academy.entity.ItemEntity;
import com.softserve.academy.entity.UserEntity;

public class UserItemsService {
	
	private UserDao userDao;
	private ItemDao itemDao;

	public UserItemsService(UserDao userDao, ItemDao itemDaol) {
		this.userDao = userDao;
		this.itemDao = itemDaol;
	}
	
	public UserItemsDto getUserItems(LoginDTO loginDTO) {
		UserItemsDto userItemsDto = null;
		UserEntity userEntity = userDao.getByFieldName("login", loginDTO.getLogin()).get(0);
		
		if(userEntity != null) {
			 userItemsDto = new UserItemsDto(userEntity.getId());
			for(ItemEntity i : itemDao.getAll()) {
				if(i.getUserId() == userEntity.getId()) {
					ItemDTO itemDTO = new ItemDTO(i.getId(), i.getTitle(), i.getDescription(), i.getUserId());
					userItemsDto.addItemDtoToList(itemDTO);
				}
			}
		}
		System.out.println("done");
		return userItemsDto;
		
	}
	

}
