package java0710;

abstract class animal{ //부모클래스
	
	
	public abstract void sound(); //추상메서드
}
interface bird{
	public void fly();
}
class dog extends animal{
	@Override
	public void sound() {
		 System.out.println("멍멍");
	}
}
class cat extends animal{
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}
class Pigeon extends animal{
	@Override
	public void sound() {
		System.out.println("구구");
	}

}
public class InterfaceTest {

	public static void main(String[] args) {
		animal d= new dog();
		animal c= new cat();
		animal p= new Pigeon();
		d.sound();
		c.sound();	
		p.sound();
	}

}

/*
	동물들의 소리를 출력한다
	개,고양이,닭,비둘기,소 등등
	각 동물은 서로 다른 개체이기 때문에 각각의 클래스로 구현
	하지만 개, 고양이, 닭들은 동물로 통합이 가능하므로
	animal이라는 부모 클래스를 두겠다
	
	클래스 상속
	1. 단일 상속- 하나의 클래스만 상속 가능하다.
	   자식클래스는 하나의 부모클래스만 가질수 있다.
	   다른 클래스의 기능을 사용하려면 포함관계로 구현
	   포함관계
	   class A{}
	   calss B{
	   		A a=new a();
	   }
	   자동차 - 타이어, 엔진, 창문, 에어컨, 핸들...
	   자동차 - 소나타, 아반떼, 그랜저, 스포티지, 카니발
	   
	2. 부모클래스의 변수와 메서드를 상속받아 사용한다.
	   부모클래스의 public, protected, default제어자
	   	변수와 메서드만 상속된다.
	   자식클래스는 부모가 상속으로 주는 모든것을 다 받아야 한다.
	   자식클래스입장에서는 선택지가 없다. 강제적으로 상속이다.
	   
	3. 강한 결합
		부모 클래스 변경이 자식클래스에 영향을 준다.
		
	인테페이스
	1. 다중 구현
	   클래스가 여러개의 인터페이스를 연결하여 구현 할 수 있다.
	2. 유연성
	   클래스는 필요한 인터페이스를 조합하여 구현 할 수 있다.
	3. 약한 결합
	   클래스는 필요한 인터페이스만 구현 하면 되므로 상속관계일때보다
	   유연성이 높아 진다.(상속보다 영향이 적다)
	
	
	
	
	
	
*/