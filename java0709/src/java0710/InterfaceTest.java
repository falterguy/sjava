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
	
	
	
	
*/