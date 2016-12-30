package com.tjpu.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

/**
 * 
 * @author 林国虎
 * @date 2016.12.7
 *
 */
public class JSONUtils {
	// 记录日志到日志服务器中
	private static Logger log = LoggerFactory.getLogger(JSONUtils.class);
	// Gson转换
	private static Gson gson = new Gson();

	private JSONUtils() {

	}

	/**
	 * 传入object对象，转化为json字符串
	 * 
	 * @author 林国虎
	 * @param object
	 * @return
	 */
	public static String objectToJsonString(Object object) {
		String json = null;
		try {
			json = gson.toJson(object);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return json;
	}

	/**
	 * 传入json转化为object对象
	 * 
	 * @author 林国虎
	 * @param json
	 *            json字符串
	 * @param object
	 *            object 对象
	 * @return
	 */
	public static <T> T jsonStringToObject(String json, Class<T> object) {
		T obj = gson.fromJson(json, object);
		return obj;
	}
}
