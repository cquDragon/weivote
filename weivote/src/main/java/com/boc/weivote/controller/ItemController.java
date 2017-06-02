package com.boc.weivote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boc.weivote.entity.Item;
import com.boc.weivote.entity.Result;
import com.boc.weivote.service.ItemService;
import com.boc.weivote.util.ResultUtils;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	/**
	 * 根据主题id获取返回选项结果
	 * @param id
	 * @return
	 */
	@RequestMapping("/{id}")
	public Result getItem(@PathVariable("id") int id){
		
		List<Item> items = itemService.getItemsByTopicId(id);
		return ResultUtils.getResult(items);
	}
}
