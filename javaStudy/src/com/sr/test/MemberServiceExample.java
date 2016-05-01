package com.sr.test;

public class MemberServiceExample {
	
	public MemberServiceExample() {}

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = MemberService.login("hong","12345");
		
		if(result){
			System.out.println("로그인 되었습니다.");
			MemberService.logout("hong");
		}else{
			System.out.println("id또는 password가 올바르지 않습니다.");
			
		}
		
	}
}
