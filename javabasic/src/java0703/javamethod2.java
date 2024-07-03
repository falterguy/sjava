package java0703;

import java.util.Scanner;

public class javamethod2 {

	public static void main(String[] args) {
	
		
		// 정수 두개 입력 받아 합을 출력하기
		Calc calc = new Calc();
//		calc.sum(40,10);
		
		//calc.sum();
	
		// 세과목의 총점을 구하여 출력하세요
		int kor= 89, eng=74, mat=43;
		calc.scoreTotal(kor,eng,mat);
		
		//메서드 호출하여 '매서드 dog쉽네~' 라고 출력
		calc.easy(); calc.view();
		
		//메서드를 호출하여 이름과 나이를 출력하세요
		//매개 변수 없는 메서드, 키보드 입력x
		
		calc.old();
		
		TestMethod testMethod=new TestMethod();
		
		//메서드를 호출하여 아래의 데이터를 출력하세요
		String animal="골드리트리버";
		String 공고일="2024-07-01";
		testMethod.dog(animal,공고일);
		
		//다음 날짜중 월과 일만 출력하세요
		//문자열 메서드 substring 또는 split 사용
		String examDate="2024-08-13";
		testMethod.day(examDate);
		
		//4사람의 나이평균값을 구하여 출력하세요
		//평균값은 정수
		int 흥민=31, 강인=23, 희찬=28, 재범=37;
		testMethod.name(흥민,강인,희찬,재범);
	}
		

}

class TestMethod{
	void name(int 흥민, int 강인, int 희찬, int 재범) {
		int old=흥민+강인+희찬+재범;
		int total=old/4;
		System.out.println(total+""+"세");
		
	}
	
	
	
	void dog(String animal,String 공고일) {
	System.out.println(animal+""+공고일);
	}
	void day(String examDate) {
	System.out.println(examDate.substring(5,10));
	//string[] current=day.split("-")
	//System.out.println(current[1]+""+current[2]);
	}
}
// 인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
// 클래스 메서드, 클래스 변수는 클래스 이름으로 사용

class Calc{
	void old() {
		String name="홍길동"; 
		int old=30;
		System.out.println(name+""+old);
	}
	
	
	
	void view() {// 변수 a,b의 값 출력하는 메서드
		int a=10, b=20;
		System.out.println(a+""+b);	
	}
	
	
	
	void easy() {
		System.out.println("메서드 dog쉽네!");
	}
	
	
	void scoreTotal(int k,int e, int m) {
		int total=k+e+m;
		System.out.println("총점:"+total);		
	}
	
	void sum(int num1, int num2) {
		int result=num1+num2;
		System.out.println("합: "+result);
	}
	
	
	
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int num1=scan.nextInt();
		System.out.print("두번째 정수:");
		int num2=scan.nextInt();
		int result=num1+num2;
		System.out.println("합 : "+result);
	
	
	 }
}
