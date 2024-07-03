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
	}

}

class ReturnMth{
	
	String getName(){
		String name="이순신";
		return name;
		
		
	}
	
	int sum() {
		int num1 = 30, num2 = 45;
		int result = num1 +num2;
		return result;
	}
	
	int get() {
		return 10;
	}
	
}