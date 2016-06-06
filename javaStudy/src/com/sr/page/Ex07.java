package com.sr.page;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 키보드로부터 문자를 읽고
 * 사용자가 입력한 문자열에서 단어를 분리하여 
 * 단어의 개수를 출력하는 프로그램을 작성
 * 단어는 공백으로 분리
 */
public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String[] str = sc.nextLine().split(" ");

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
			count++;
		}
		
		System.out.println(count);
		
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while (true) {

				int c = rd.read();
				if (c == -1) {
					break;
				}
			}

		} catch (IOException e) {
			System.out.println("입력 오류 발생");
		}
		System.out.println();
	}
}
