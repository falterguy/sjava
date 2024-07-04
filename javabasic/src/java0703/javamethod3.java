package java0703;

public class javamethod3 {

	public static void main(String[] args) {
		
		//메서드를 통해서 숫자 10을 받아 출력한다
		ReturnMth rm= new ReturnMth();
		
		int num=rm.get();
		System.out.println(num);
	
		//메서드로부터 두정수의 더하기 결과 받아서 출력하기
	       int 결과 = rm.sum();
	       System.out.println(결과);
	
	    //다음의 물음표에 들어갈 코드를 작성하여 이름과 나이가 출력
	    String userName =rm.getName();
	    int age=34;
	    System.out.println(userName+""+age);
	    
	    // 국어(89), 영어(78) ,수학(50) 세과목의 총점을 구하는 메서드
	    // 3과목의 평균을 구하는 메서드
	    // 총점과 평균
	  int tot=rm.total();
	 int avg=rm.avg(tot);
	 System.out.println(tot+""+avg);
	    
	   
	    
	        
	}

}

/* 주사위 게임
  2명이 주사위 게임을 한다 주사위는 하나 6면이고 주사위 값이 큰사람이 이긴다 주사위값 구하는 메서드 값 비교하여 누가 이겼는지 출력
 */

class ReturnMth{
	
	int avg( int tot ) {
		return tot/3;
	}
	
	int total() {
		int kor=89, eng=78 , mat=50;
		return (kor+eng+mat);
	}
	
	
	String  getName(){
		String name = "이순신";
		return name;
	}
	
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 + num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
}