package com.sr.chat1;

import java.net.*;
import java.io.*;

public class ChatClient {

	public static void main(String[] args) {
		if (args.length != 2) { // 서버 접속시 id와 ip를 입력 안 하고 접속 할 경우
			System.out.println("사용법 : java ChatClient id 접속할서버ip"); // 입력 하고 접속시
																	// 이 문장은
																	// 생략된다.
			System.exit(1); // //exit(0)이 아닌 exit(1) -> 이상종료를 나타냅니다.
		}

		Socket sock = null; // 소켓 선언
		BufferedReader br = null; // BufferedReader 선언
		PrintWriter pw = null; // PrintWriter 선언

		boolean endflag = false; // 종료를 나타내주는 endflag를 boolean형으로 선언
		try {
			sock = new Socket(args[1], 10001); // 호스트의 ip와 포트는 10001을 사용
			pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream())); //
			br = new BufferedReader(new InputStreamReader(sock.getInputStream())); //
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); // 입력
																							// 받고
			// 사용자의 id를 전송한다.
			pw.println(args[0]); // 사용자의 아이디 출력
			pw.flush();

			InputThread it = new InputThread(sock, br); // 소켓과 br를 만든
														// InputThread에 넘기고
			it.start(); // 쓰레드를 실행하고
			String line = null; // 키보드를 입력 받을 line을 선언하고

			while ((line = keyboard.readLine()) != null) { // 입력이 있을때까지 반복해서 실행
				pw.println(line); // 라인을 출력해주고
				pw.flush();
				if (line.equals("/quit")) { // 만약 그 문구가 /quit일 경우 종료한다.
					endflag = true; // 종료를 나타내는 endflag를 true값으로 변경
					break;
				}
			}
			System.out.println("클라이언트의 접속을 종료합니다."); // 클라이언트 종료
		} catch (Exception ex) {
			if (!endflag)
				System.out.println(ex);
		} finally { // 남아있는 pw, br, sock를 close()
			try {
				if (pw != null)
					pw.close();
			} catch (Exception ex) {
			}
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
			try {
				if (sock != null)
					sock.close();
			} catch (Exception ex) {
			}
		} // finally
	} // main
} // class

class InputThread extends Thread {
	private Socket sock = null;
	private BufferedReader br = null;

	public InputThread(Socket sock, BufferedReader br) {
		this.sock = sock;
		this.br = br;
	}

	public void run() { // 쓰레드의 runable()메서드
		try {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception ex) {
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception ex) {
			}
			try {
				if (sock != null)
					sock.close();
			} catch (Exception ex) {
			}
		}
	} // InputThread
}
