package com.boc.weivote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boc.weivote.entity.Item;
import com.boc.weivote.entity.ItemExample;
import com.boc.weivote.entity.User;
import com.boc.weivote.mapper.ItemMapper;
import com.boc.weivote.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	public static final String SPLIT_STR = " ";
	@Autowired
	ItemMapper itemMapper;
	
	@Override
	public List<Item> getItemsByTopicId(int topicId) {
		ItemExample example = new ItemExample();
		
		example.createCriteria().andTopicIdEqualTo(topicId);
		example.setOrderByClause("sequence");
		List<Item> items = itemMapper.selectByExample(example);
		
		return items;
	}
	
	@Override
	public boolean hasVote(int userId, int topicId) {
		ItemExample example = new ItemExample();
		
		example.createCriteria().andTopicIdEqualTo(topicId).andVoteUserIdsLike("%"+SPLIT_STR+userId+SPLIT_STR+"%");
		int count = itemMapper.countByExample(example);
		return (count>0);
	}

	@Override
	public boolean update(Item item, User user) {
		item.setVoteUserIds("");
		for(int i=0;i<(int)user.getUserRight();i++){
			item.setVoteUserIds(item.getVoteUserIds()+SPLIT_STR+user.getId()+SPLIT_STR);
		}
		return itemMapper.updateVoteUsers(item)>0;
	}
}
