package com.sr.page;

/*
 * "They is students." 스트링에서 "is"를 "are"로 대치하는 StringSub 클래스를 작성하라
 * 
 */
public class StringSub {

	public static void main(String[] args) {
		String str = "They is students.";
		System.out.println(str);
		
		String newStr = str.replace("is", "are");
		System.out.println(newStr);
		
		
	}
}
