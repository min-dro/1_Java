package com.kh.ttt.NetworkController;
import com.kh.ttt.gameController.TictactoeController;
import com.kh.ttt.model.vo.Users;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
	public void Main() {

Scanner sc = new Scanner(System.in);
Users u = new Users();
TictactoeController tc = new TictactoeController();
		// 1) 포트 번호 지정 : 서버측에서 몇 번 포트로 통로를 열어 줄 것인지를 의미
		int port = 3000;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		ServerSocket server = null;
		// 2) ServerSocket 객체 생성하여 포트를 적용
		try {
			// ServerSocket : 클라이언트의 연결 요청을 받을 용도의 소켓
			server = new ServerSocket(port);		// 이때 서버가 구동됨!
			
			// 3) 클라이언트로부터 접속 요청이 들어올때까지 대기
			System.out.println("매칭중...");
			
			// 4) 연결 요청이 들어오면 요정 수락 후 해당 클라이언트와 통신 준비
			//		통신 준비=> 서버측에서 Socket 객체 생성
			Socket socket = server.accept();
			// 어디로부터 요청이 왔는지 확인
			System.out.println("매칭성공!");
			System.out.println("  0 1 2");
			System.out.println("0");
			System.out.println("1");
			System.out.println("2");
			
			// 5) 클라이언트와 입출력 기반스트림 생성 
			// 6) 보조스트림을 통해 성능 개선
			//  입력용 스트림 ( 클라이언트로부터 전달된 값을 한 줄씩 읽어오기 위해 사용될 입력용 스트림 )
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//	출력용 스트림 ( 클라이언트에게 값을 한 줄씩 출력할 수 있는 스트림 )
			//	 * PrintWriter : print(), println() 메소드를 통해 데이터 출력
			pw = new PrintWriter(socket.getOutputStream());
			int count = 0;
			int userScore1 = u.getNvnScore();
			int userScore2 = u.getNvnScore();
			// 7) 스트림 통해 읽고 쓰기
			while(true) {		// 계속 입력/출력하기 위해 무한루프 사용.
				if (count % 2 == 0) {
					System.out.println(u.getUserName() + "님의 차례입니다.");
					while (true) {
						System.out.print("가로 값을 입력하세요 : ");
						tc.length = sc.nextInt();
						System.out.print("세로 값을 입력하세요 : ");
						tc.width = sc.nextInt();
						if ((tc.length != 2 && tc.length != 1 && tc.length != 0) || (tc.width != 2 && tc.width != 1 && tc.width != 0)) {
							System.out.println("원하는 값이 아닙니다. 다시입력해주세요.");
						} else if (tc.frame[tc.width + 1][tc.length + 1] == 'X' || tc.frame[tc.width + 1][tc.length + 1] == 'O') {
							System.out.println("해당 값에 이미 입력한 값이 있습니다. 다시입력해주세요.");
						} else {
							break;
						}
					}
					char x = '0';
					char y = '0';
					tc.width += 1;
					tc.length += 1;
					for (int i = 0; i < tc.frame.length; i++) {
						for (int j = 0; j < tc.frame.length; j++) {
							if (i == 0 && j == 0) {
								System.out.print("");
							} else if (i == 0 || j == 0) {
								if (j == 0) {
									tc.frame[i][j] = (char) x++;
								} else {
									tc.frame[i][j] = (char) y++;
								}
							} else if (i == tc.width && j == tc.length) {
								if (count % 2 == 0)
									tc.frame[i][j] = 'X';
								else if (count % 2 == 1)
									tc.frame[i][j] = 'O';
							} else {
								System.out.print("");
							}
							System.out.print(tc.frame[i][j] + " ");
						}
						System.out.println();
					}
					count++;
				} else if (count % 2 == 1) {
					System.out.println(u.getUserName() + "님의 차례입니다.");
				}
				// 클라이언트로부터 입력을 받기
				pw.println(tc.frame[0][0]+" "+tc.frame[0][1]+" "+tc.frame[0][2]+" "+tc.frame[0][3]+"\n"+
						tc.frame[1][0]+" "+tc.frame[1][1]+" "+tc.frame[1][2]+" "+tc.frame[1][3]+"\n"+
						tc.frame[2][0]+" "+tc.frame[2][1]+" "+tc.frame[2][2]+" "+tc.frame[2][3]+"\n"+
						tc.frame[3][0]+" "+tc.frame[3][1]+" "+tc.frame[3][2]+" "+tc.frame[3][3]);	
				String message = br.readLine();
				System.out.println(message);
				
					pw.println("수신 완료!");	
					pw.flush();	
				
				
					
				// 클라이언트에게 데이터 전달(출력)
					// 클라이언트에게 출력.
				
				
								// 현재 스트림에 있는 데이터를 강제로 내보내는 메소드
											// 	close() 메소드가 호출되면 자동으로 flush됨.
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 8) 통신 종료
			try {
				if(pw != null) pw.close();
				if(br != null) br.close();
			
				if(server != null)server.close();		// 서버 닫기(종료)
			} catch(IOException e) {}
		}
    }
}
