package com.boc.weivote.util;

import java.util.List;

import com.boc.weivote.entity.JSONResult;
import com.boc.weivote.entity.Result;

public class ResultUtils {
	public static final Result SUCCESS_RESULT = new Result("0000",true);
	public static Result getResult(List<?> list){
		if(list==null||list.size()<1)
			return new Result("0001",false,"查询结果为空");
		@SuppressWarnings("rawtypes")
		JSONResult<List> result  = new JSONResult<>(list);
		return result;
	}
	
	public static Result returnErrorResult(String statusCode,String message){
		return new Result(statusCode,false,message);
	}
}
