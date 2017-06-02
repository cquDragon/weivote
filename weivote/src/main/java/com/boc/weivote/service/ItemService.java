package com.boc.weivote.service;

import java.util.List;

import com.boc.weivote.entity.Item;
import com.boc.weivote.entity.User;


public interface ItemService {
	public List<Item> getItemsByTopicId(int topicId);
	
	public boolean hasVote(int userId,int topicId);

	public boolean update(Item itemId, User user);
}
