package com.boc.weivote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boc.weivote.entity.Result;
import com.boc.weivote.entity.Topic;
import com.boc.weivote.service.TopicService;
import com.boc.weivote.util.ResultUtils;

@RestController
@RequestMapping("/topic")
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@RequestMapping("/getAll")
	public Result getItems(){
		
		List<Topic> topics = topicService.getTopics();
		return ResultUtils.getResult(topics);
		
	}
}