package classBasic;

public class ClassBasic {

	public static void main(String[] args) {
		// Scanner String Arrays
		// 정의 된 클래스 타입의 공간을 생성한다.
		// 생성된 공간에 데이터를 저장한다.
		// 클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고 한다.
		
		// 클래스 인스턴스 생성 - 생성자 메서드
		Member member1 = new Member();
		Member member2 = new Member();
		
		System.out.println(member1);
		
		member1.name="이순신";
		member1.age=23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		member2.name="김유신";
		member2.age=34;
		
		//java- 495p , 메모리 최적하기법 -893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page=495;
		
		book2.title = "메모리최적화기법";
		book2.page=495;
		
		// 스마트폰 제품명, 운영체제,메모리(ram)크기에 대해 저장할 수 있는 클래스를 정의하고
		// 인스턴스를 생성하여 값 저장,출력을 하세요
		// 값 저장, 출력을 하세요
		
		Phone phone1=new Phone();
		Phone phone2=new Phone();
		Phone phone3=new Phone();
		
		phone1.name="갤럭시1";
		phone1.system="안드로이드";
		phone1.ram=128;
		
		phone2.name="아이폰";
		phone2.system="ios";
		phone2.ram=256;
		
		phone3.name="갤럭시2";
		phone3.system="안드로이드2";
		phone3.ram=512;
	
		System.out.print(phone1);
		System.out.print(phone2);
		System.out.print(phone3);
	}

}
class Phone{
	String name;
	String system;
	int ram;
	
}
	
	







//책 제목과 총페이지수를 저장하기위한 클래스 정의
class Book{
	String title;
	int page;
	
}



// 클래스 - 설계도, 객체-제품
// 클래스 - 빵틀, 객체-붕어빵

// 클래스는 사용자 정의 데이터 타입 이라고 한다.
class Member{ //Member 라는 이름의 클래스 정의
	String name; //이름
	int age; //나이
	Member(){
		
	}
	
}








