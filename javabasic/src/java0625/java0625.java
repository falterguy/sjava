package java0625;

public class java0625 {


	public static void main(String[] args) {
		// 자바 기본 구조 - 프로젝트 - 패키지 - 클래스
		
		System.out.println("자바테스트"); // 출력
		// 코드실행 - 왼쪽ctrl + f11
		// 자바 변수 생성
		// -> 데이터타입 변수이름 = 데이터 ;
		// 데이터 의 종류에는  정수, 실수, 문자
		// 정수 - byte , short, int, long ,char
		// 문자 - char
		// 실수 - float , double,
		
		byte num = 127;  // 1byte
		short num1 = 200; // 2byte
		int num2 = 2323;  // 4byte
		long num3 = 234L; // 8byte
	
	char ch= 'a'; //''작은따옴표가 문자, ""큰따옴표가 문자열
	
	float fnum=3.14f; 
	double dnum=12.345;
	fnum=35;
	
	
	boolean isTrue = false;
	
	//String word="이순신"; //string은 클래스이다
	// 클래스(첫글자 대문자) - 사용자 정의 타입
	
	// 사각형의 넓이를 구하시오.(밑변과 높이는 정수이다.)
	int width=15;
	int height=20;
	int area=width*height;
	System.out.println("넓이:"+area); //문자열과 함께 쓰는 방법
	
	//키보드 30개를 구매해야한다
	//hp게이밍 키보드의 가격이 8000원이라면 총 구매금액은 얼마인가?
	int key=30;
	int hp=8000;
	int total=key*hp;
	System.out.println("촣금액:"+total);
	System.out.print("java 출력 방법  pring");
	System.out.print("줄바꿈 안된다.\n");
	System.out.printf("printf\n출력"); //\n 엔터키
	//서식문자-형식지정문자	
	System.out.printf("총금액:%d ", total);
	//%d - 10진수 정수
	//%u - 10진수 정수
	//%f - 10진수 실수
	//%c - 문자
	//%s - 문자열
	//%b - boolean(false, true)
	//%o - 8진수 정수 %x-16진수
	System.out.printf("국어: %d점 수학:%d점 \n",80,90);
	
	System.out.printf("나이:%d 키:%f",34 ,172.3);
	System.out.println(172.3);
	System.out.print(172.315);
	System.out.printf("\n %.1f", 172.315); //소수점 자리수 조절 ex)"%.nf" n에 표현숫자 입력
	System.out.printf("%5d", 3); //5자리숫자 확보 ex)_ _ _ _ 5
	
	
	//num=3.14;
	//
	
	
	//num=3.14;
	//num="이순신"
	}

}
