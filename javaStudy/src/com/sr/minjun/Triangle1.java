package com.sr.minjun;
import java.util.Scanner;

public class Triangle1 {

	public static void main(String[] args) {
		System.out.println("몇 층?");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
        System.out.println("1");
        //1번
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("2");
		//2번
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("3");
		//3번 (변수 증감식 전부 ++)
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num-i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("4");	
		//3번 (--를 이용한 역삼각형 응용)	
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("5");

		//4번 (--증감식 역삼각형)
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int j = num; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("6");

		//5번 
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("7");

		//6번 5번 변형
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("8");

		//7번 
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--)
				System.out.print("*");
			for (int j = num; j >= i; j--)
				System.out.print("*");
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
		}
		System.out.println();
		System.out.println("9");
		//7번 (--증감식 역삼각형 응용)
		for (int i = num; i>=1; i--) {
			for (int j = 1; j <= num-i; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("10");		
		//7번 (--증감식 역삼각형 응용 합치기)
		for (int i = num; i>=1; i--) {
			for (int j = 1; j <= num-i; j++)
				System.out.print(" ");
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("11");

		//8번 7번(--증감식 역삼각형 응용 합치기) 변형
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--)
				System.out.print("* ");
			System.out.println();
			for (int j = 1; j <= i; j++)
				System.out.print(" ");
		}
		System.out.println();
		System.out.println("12");

		//9번 1, 2번 응용
		for (int i = 1; i <= num; i++) {
			if (i <= num / 2) {
				for (int j = 1; j <= i; j++)
					System.out.print("* ");
			} else {
				for (int j = num; j >= i; j--)
					System.out.print("* ");
			} System.out.println();
		}
		System.out.println("13");

		//9번 명운 풀이
		int y=1;
		for(int i=1; i<=num; i++){
	         if(num%2!=0){
	            if(i<num/2+1){
	               for(int j=1; j<=y; j++) System.out.print("#");
	               y++;
	            }else{
	               for(int j=1; j<=y; j++) System.out.print("#");
	               y--;
	            }
	         }else{
	            if(i<num/2){
	               for(int j=1; j<=y; j++) System.out.print("#");
	               y++;
	            }else{
	               if(i==num/2){
	                  for(int j=1; j<=y; j++) System.out.print("#");
	               }else{
	                  for(int j=1; j<=y; j++)   System.out.print("#");
	                  y--;
	               }
	            }
	         }System.out.println();
	      }
	}
}
