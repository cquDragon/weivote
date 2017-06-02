package com.boc.weivote.service;

import java.util.List;

import com.boc.weivote.entity.Topic;

public interface TopicService {
	/**
	 * 获取主题列表接口数据
	 * @return
	 */
	public List<Topic> getTopics();
	
	public Topic getTopic(int topicId);
	
	/**
	 * TODO 根据用户id获取可以参与投票的主题清单
	 */
	
	

}
