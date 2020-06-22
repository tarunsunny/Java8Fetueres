package com.marlabs.Jva8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class TestDate {

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);
		TimeZone australiaMelbourneTimeZone = TimeZone.getTimeZone("Australia/Melbourne");

		DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd-MM-uuuu HH:mm:ss" ) ;
		LocalDateTime ldt = LocalDateTime.parse( "15-05-2014 00:00:00" , f ) ;
	}

}
