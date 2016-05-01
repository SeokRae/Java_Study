package com.sr.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 
 * @author "KimSR"
 * 
 */
public class FileDAO {
	File file = new File("C:\\Users\\kimSR\\workspace\\Java_Study\\src\\com\\sr\\file\\대졸연봉순위.csv");

	FileDAO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param afvo
	 */
	FileDAO(List<FileVO> afvo) {
		System.out.println(getPath());
		System.out.println(isExist());
		fileRead(afvo);
	}

	/**
	 * 
	 * @param afvo
	 */
	public void fileRead(List<FileVO> afvo) {
		try {
			// file 불러오기
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

	public String getPath() {
		return file.getPath();
	}

	public boolean isExist() {
		return file.exists();
	}

}
