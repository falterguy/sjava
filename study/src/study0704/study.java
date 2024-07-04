package study0704;

import java.util.ArrayList;

public class study {

	public static void main(String[] args) {
	//자바의 자료구조
	//자료구조란 데이터를 효율적으로 저장 관리하기 위한 구조
	
	ArrayList<String> arr = new ArrayList<String>();				//클래스 대문자 시작, 인덱스 존재X
	arr.add("이순신");
	arr.add("장보고");
	arr.add("대조영");
	
	System.out.println(arr);	//테스트용 확인용 실제 출력X
	
	for(int i=0; i<arr.size(); i++) {
		System.out.println(arr.get(i));
	}
	
	for(String name:arr) {
		System.out.println(name);
	}
	
	
	//ArrayList를 사용하기-어려우면 정적배열로 String[]방식
	//이름 10개 저장(아무거나 입력)
	//이름 중에서 김씨만 출력 
	
	
		
	}

}
