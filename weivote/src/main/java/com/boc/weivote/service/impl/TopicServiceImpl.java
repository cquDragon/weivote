package com.boc.weivote.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boc.weivote.entity.Topic;
import com.boc.weivote.entity.TopicExample;
import com.boc.weivote.mapper.TopicMapper;
import com.boc.weivote.service.TopicService;
@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	TopicMapper topicMapper;
	
	
	@Override
	public List<Topic> getTopics() {
		TopicExample example = new TopicExample();
		example.createCriteria().andStatusEqualTo((byte) 1);
		List<Topic> allTopics = topicMapper.selectByExample(example);
		return allTopics;
	}


	@Override
	public Topic getTopic(int topicId) {
		return topicMapper.selectByPrimaryKey(topicId);
	}

}
