package com.sr.test;

public class MemberService {
	String id = null;
	String password = null;

	public static boolean login(String id, String password) {
		if ("hong".equals(id) && "12345".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public static void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
