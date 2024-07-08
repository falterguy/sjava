package homeproduct;

public class mainclass {

	public static void main(String[] args) {
		
//		String a;
//		a.toString()
//		Interger b;
//		b.toString();
//		Date aa;
//		aa.toString();
		
		Tv tv=new Tv();
		tv.brand="삼성";
		tv.power();
		tv.power();
		tv.channelUp();
		tv.channel++;
		
		Aircon air =new Aircon();
		air.brand="LG휘센";
		System.out.println(air.brand);
		air.power();
		air.power();
		air.windControl();
		
		System.out.println("다형성");
		House tv2 =new Tv("LG",150000);
		tv2.power();
		House item=new Tv("삼성",1750000);
		item.power();
		item=new Aircon("휘센",1030000);
		//item.windControl();
		
		// tv객체 100개, 에어컨 객체 30개, 
		
		House[] arr= {new Tv(), new Aircon(), new Computer()};
	}

}
// 클래스들의 관계 - 상속관계
// 상속관계에 놓여있는 클래스들은 부모 클래스와 자식클래스로 나뉜다.
//부모클래스의 필드(변수), 메서드를 하위클래스(자바클래스)에서 사용가능하다.
// 1. 상속은 재사용을 위해 사용한다. - 여러 클래스들간의 중복코드를
// 하나의 클래스로 통합시켜 사용
// 2. 상위클래스(부모클래스)의 필드(변수), 메서드를 모두 하위(자식)클래스에서 사용하지는 못한다. 제어자에 따라, 패키지에 따라 제한적이다
// 3. 하위(자식)클래스에서 부모를 지칭하는 예약어는 super이다.
// 






// 클래스 상속
// 상속 하려면 자식클래스 이름 뒤에 extends 부모클래스이름
// extens - 확장,연장...
// Tv extends House -> Tv클래스가 자식이고 House가 부모클래스이다.
// 상속을 하는 가장 큰 이유- 다형성
// 부모클래스의 인스턴스 변수, 인스턴스메서드, 클래스변수, 
// 클래스메서드 사용가능하다.
// 단, 부모클래스의 모든걸 사용하지는 못한다. 일부
// 제어걸려있는 변수나 메서드는 사용 불가
// 생성자메서드를 통해 인스턴스변수들의 초기화는 
// 자식클래스가 가지고 있는 변수는 자식클래스 생성자 메서드에서 초기화
// 부모클래스가 가지고 있는 변수는 부모클래스 생성자 메서드에서 초기화



/*	자바의 제어자
	1.static - 클래스의 정적 변수. 정적 메서드
			 - 클래스에서 공동으로 사용할수 있는 변수, 메서드
			 - 객체에 속하지 않고 클래스에 속한다.
			 - 클래스명 .static변수명 , 클래스명,static메서드()
	
	2.abstract - 추상 클래스, 추상 메서드
			   - 미완성의 의미를 가진다.
			   - 추상클래스는 객체 생성 불가
			   
	3. final - 변경되지 않는 의미로 사용된다.
			 - 변수 앞에 final을 붙이면 변수 값 변경 불가
			 - 메서드 앞에 final을 붙이면 해당 메서드는 오버라이딩 불가
			 - 클래스 앞에 final을 붙이면 상속 불가

	4. 접근 제어자
	   public - 어디서나 누구든지 사용가능한 제어자
	   default - 같은 패키지에서만 접근 가능 
	   protected - 같은 패키지에서만 접근가능 ,
	   			 - 상속 관계일 경우 패키지가 달라도 접근 가능
	   private - 어디서나 누구든지 사용 못한다.
	   		   - 클래스내부에서 만 사용가능
	   		 	
			 
			 
*/


