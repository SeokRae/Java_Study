package com.sr.page;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * Calendar 클래스를 이용하여 
 * 현재 시간에 따라 새벽 4시에서 낮 12시 이전이면 "Good Morning",
 * 오후 6시 이전이면 "Good Afternoon",
 * 밤 10시 이전이면 "Good Evening",
 * 그 이후는 "Good Night"을 출력하는 프로그램을 작성하라
 */
public class CalendarToday {
	public static void main(String[] args) {

		// 기본적으로 현재 날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HHmm");

		int todayTime = Integer.parseInt(sdf.format(today.getTime()));

		if (todayTime > 0400 && 
			todayTime < 1200) {
			System.out.println("Good Morning");
		} else if (todayTime > 1800 &&
				todayTime < 2200){
			System.out.println("Good Aftering");
		} else {
			System.out.println("Good Evening");
		}
	}
}
