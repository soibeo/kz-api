package com.kazan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KazanStringUtils {
	public static final SimpleDateFormat KAZAN_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	public static Date formatDate(String dateString) {
		try {
			return KAZAN_DATE_FORMAT.parse(dateString);
		} catch (ParseException e) {
			System.out.println("KazanStringUtils:" + e);
			return new Date(0);
		}		
	}
}
