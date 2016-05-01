package com.sr.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @author "KimSR"
 * 
 */
public class FileDAO {
	Scanner sc = new Scanner(System.in);

	// Default 메소드
	FileDAO() {
		// TODO Auto-generated constructor stub
	}

	// 생성자 메소드
	FileDAO(List<FileVO> afvo) {
		fileRead(afvo);
		fileSort(afvo);
	}

	// 파일 읽기 메소드
	public void fileRead(List<FileVO> afvo) {
		try {
			// file 불러오기
			File file = new File("C:\\Users\\kimSR\\workspace\\javaStudy\\src\\com\\sr\\file\\대졸연봉순위.csv");
			// file 읽기
			FileReader fileReader = new FileReader(file);
			// file 읽어오는 방식
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String contents = "";

			while ((contents = bufferedReader.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(contents, ",");

				while (st.hasMoreElements()) {
					// 7개의 요소를 하나의 객체로 생성해서 ArrayList에 넣는다.
					FileVO fvo = new FileVO(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(),
							st.nextToken(), st.nextToken(), st.nextToken());

					afvo.add(fvo);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// default print
	public void fileShow(List<FileVO> afvo) {
		for (FileVO fvo : afvo) {
			System.out.println(fvo);
		}
	}

	// default sort print
	public void fileSort(List<FileVO> afvo) {
		// 기본 정렬
		Collections.sort(afvo);
		for (int i = 0; i < afvo.size(); i++) {
			if (i == 500) {
				this.sleep(2500);
			}
			System.out.println(afvo);
		}
	}

	// area sort print
	public void areaSort(List<FileVO> afvo) {
		System.out.println("검색 하시길 원하시는 지역을 입력하세요.");
		String str = sc.nextLine();
		if (afvo.contains((String) str)) {
			System.out.println(afvo);
		}
	}

	// sleep method
	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// public void menu() {
	// int select = sc.nextInt();
	// System.out.print("1. <순위>, 2. <지역>, 3. <연봉>, 4. <나가기>");
	//
	// switch (select) {
	// case 1:
	// break;
	// case 2:
	// break;
	// case 3:
	// break;
	// case 4:
	// break;
	// case 5:
	// break;
	// default:
	//
	// }
	// }
}
