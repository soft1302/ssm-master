package com.tjpu.util;

/**
 * 判断一个电话号码是否有效
 * 
 * @author 林国虎
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneUtils {
	public static boolean isMobileNO(String mobiles) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		return m.matches();
	}
}
