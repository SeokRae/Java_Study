package com.sr.page;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10 {
	int histoData[] = new int[26]; // 영어 알파벳 26자를 카운팅하는 정수형 배열
	StringBuffer sb = new StringBuffer(); // 키 입력을 받을 스트링 버퍼

	// 키보드로부터 알파벳 문자를 읽고 히스토그램을 그리는 핵심 메소드
	public void run() {
		readString();
		makeHistogram();
		// 마지막
	}

	// 입력받은 문자들로부터 히스토그램의 데이타를 만든다.
	public void makeHistogram() {
		String s = sb.toString(); // 스트링 버퍼의 문자열을 스트링으로 리턴
		StringTokenizer st = new StringTokenizer(s, " ");
		
		String left = "";
		String right = "";
		while (st.hasMoreElements()) {
			right = st.nextToken();
			if (left.length() < right.length()) {
				left = right;
			}
		}
		System.out.println(left);
	}

	// 키보드로부터 문자열을 읽어 스트링 버퍼에 저장한다.
	public void readString() {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {
				int c = rd.read(); // Ctrl-z가 입력되면 -1을 리턴한다.
				if (c == -1)
					break;
				// 중요 **
				sb.append((char) c); // 읽은 문자를 스트링 버퍼에 추가한다.
			}
		} catch (IOException e) {
			System.out.println("입력 에러 발생");
		}
	}

	public static void main(String[] args) {
		Ex10 app = new Ex10();
		app.run();
	}

}