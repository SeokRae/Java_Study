package com.sr.page;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStreamReader rd = new InputStreamReader(System.in);
		int count = 0;
		try {

			while (true) {

				String str = sc.nextLine();
				for (int i = 0; i < str.length(); i++) {
					char car = (char) str.charAt(i);
					if (car >= 65 && car <= 90) {
						count++;
					}
				}

				int c = rd.read();
				if (c == -1) {
					break;
				}
			}
			System.out.println("대문자 : " + count + "");
		} catch (IOException e) {
			System.out.println("입력 오류 발생");
		}
	}
}
