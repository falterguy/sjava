package java0627;

public class Loop {
		
	public static void main(String[] args) {
		//반복문 -for,while,do-while
		// for
		//for(초기값; 조건식; 증감식){반복내용}
		//조건식이 거짓이 될때까지 중괄호안의 내용이 계속 실행된다.
		//초기값->조건식비교->참이라면->중괄호->증감식->조건식비교->참이라면->중괄호->증감식->조건식비교->거짓이라면->끝
	for(int i=1; i<=17; i+=2){
		System.out.println("아 반복문......"+i);
		}
	for(int i=10; i>0; i--) {
		System.out.println(i);
	}
	
	int num=1;
	int a=1;
	num = num+a;
	System.out.println(num); //2
	a++;
	
	num=num+a;
	System.out.println(num); //4
	a++;
	
	num=num+a;
	System.out.println(num); //7
	a++;
	
	
	
	}
}
