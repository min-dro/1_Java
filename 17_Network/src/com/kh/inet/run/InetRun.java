package com.kh.inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	public static void main(String[] args) {
		/*
		 * 네트워크 (Network) : 여러 대의 컴퓨터들이 연결되어 있는 통신망
		 * 					  => 이 네트워크를 통해 서로 데이터를 교환할 수 있음.
		 * - IP 주소	: 네트워크 상에 각 컴퓨터들을 식별해주는 번호 (컴퓨터의 주민번호)
		 * - 포트 번호 : 한 컴퓨터 내에 프로그램을 식별해주는 번호
		 * 
		 * - 서버			: 클라이언트(고객)에게 서비스를 제공해주는 프로그램
		 * 				  클라이언트의 요청을 처리해서 응답
		 * - 클라이언트	: 서버에 요청을 하는 프로그램(컴퓨터)
		 * 				  서비스를 제공받는 고객
		 * 
		 * * 서버에 요청하기 위해서 요청하고자 하는 서버의 "IP 주소", "포트 번호"가 필요함.
		 */
		
		// InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
		try {
			InetAddress localhost = InetAddress.getLocalHost();		// getLocalHost() : 내 PC에 대한 정보를 반환
			
			System.out.println(localhost);		// "Pc 정보 / IP 주소"
			
			System.out.println("내 PC 정보 : " + localhost.getHostName());		// 호스트의 이용 반환
			System.out.println("내 IP 주소 : " + localhost.getHostAddress());		// 호스트의 IP 주소 반환
			
			System.out.println("===================================");
			
			// 도메인을 텅해서 서버 정보를 확인
			InetAddress googleHost = InetAddress.getByName("www.google.com");	// getByName(도메인명) : 도메인을 통해 해당 호스트
			
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 IP 주소 : " + googleHost.getHostAddress());
			
			// 도메인을 통해서 서버 관련된 정보를 배열로 받아 확인
			//	* 메소드 호출 후 결과를 받을 변수의 데이터타입은,
			//		메소드의 반환타입으로 사용
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이터 호스트 개수 : " + naverHost.length);
			for(InetAddress n : naverHost) {	// for(배열에_담긴_데이터_타입 변수명 : 배열_변수명) {}
				System.out.println("네이버 호스트");
				System.out.println("네이버 IP주소");	
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
