package com.boc.weivote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.boc.weivote.entity.Item;
import com.boc.weivote.entity.Result;
import com.boc.weivote.entity.Topic;
import com.boc.weivote.entity.User;
import com.boc.weivote.service.ItemService;
import com.boc.weivote.service.TopicService;
import com.boc.weivote.service.UserService;
import com.boc.weivote.util.ResultUtils;

@RestController
public class VoteController {
	@Autowired
	ItemService itemService;
	@Autowired
	UserService userService;
	@Autowired
	TopicService topicService;
	
	@RequestMapping("/vote")
	@PostMapping
	// {"userId":int,"items":[int,...,int],"topicId":[int]}
	public Result getResult(@RequestBody String jsonStr) {
		JSONObject json = JSONObject.parseObject(jsonStr);
		int userId = json.getInteger("userId");
		JSONArray items = json.getJSONArray("itemIds");
		int topicId = json.getInteger("topicId");
		
		if(!validVote(topicId, items))
			return ResultUtils.returnErrorResult("0005", "请按照规定进行选择");
		if (!hasRight(userId,topicId))
			return ResultUtils.returnErrorResult("0003", "用户无权投票");
		
		if (hasVote(userId,topicId))
			return ResultUtils.returnErrorResult("0002", "用户已经投票");
		
		if(doVote(userId,items))
			return ResultUtils.SUCCESS_RESULT;
		
		return ResultUtils.returnErrorResult("0004", "投票失败了~1~");
	}

	
	
	private boolean doVote(int userId, JSONArray items) {
		User user = userService.getUser(userId);
		for(int i=0;i<items.size();i++){
			Item item = new Item();
			item.setId(items.getInteger(i));
			if(!itemService.update(item,user))
				return false;
		}
		return true;
	}
	
	
	/**
	 * 是否必选，必选 是否选足够的项了；否 是否不大于最大可选项
	 * @param topicId
	 * @param items
	 * @return
	 */
	private boolean validVote(int topicId,JSONArray items){
		Topic topic = topicService.getTopic(topicId);
		if(topic.getRequeired().intValue()==1)
			return items.size()==topic.getMaxChecks().intValue();
		return !(items.size()>topic.getMaxChecks().intValue());
	}
	private boolean hasVote(int userId, int topicId) {
		return itemService.hasVote(userId, topicId);
	}

	private boolean hasRight(int userId, int topicId) {
		//TODO 
		return true;
	}

}
