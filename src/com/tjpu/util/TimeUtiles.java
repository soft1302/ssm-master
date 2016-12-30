package com.tjpu.util;

/**
 * 时间和日期进行互换
 * 
 * @author 林国虎
 * 
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtiles {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd H:m:s");
	private static SimpleDateFormat formatD = new SimpleDateFormat("yyyy-MM-dd");

	private TimeUtiles() {

	}

	/**
	 * 时间格式
	 * 
	 * @param time
	 *            long类型的时间
	 * @return
	 */
	public static String getFormatTime(long time) {
		return format.format(time);
	}

	/**
	 * 时间格式
	 * 
	 * @param time
	 *            long类型的时间
	 * @return
	 */
	public static String getFormatDTime(long time) {
		return formatD.format(time);
	}

	/**
	 * 字符串时间转化为整形
	 * 
	 * @param time
	 * @return
	 */
	public static long getFormatTimeToLong(String time) {
		try {
			Date date = format.parse(time);
			return date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/**
	 * 字符串时间转化为整形
	 * 
	 * @param time
	 * @return
	 */
	public static long getFormatDTimeToLong(String time) {
		try {
			Date date = formatD.parse(time);
			return date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/**
	 * 只需要年月日的整形时间
	 * 
	 * @param time
	 * @return
	 */
	public static long getDay(long time) {
		try {
			String strDay = formatD.format(time);
			Date date = formatD.parse(strDay);
			return date.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return -1;
	}

}
