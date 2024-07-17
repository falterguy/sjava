package java0717_1;

public class GenericStudy1 {

	public static void main(String[] args) {
		
		FruitBox<Apple> appleBox = new FruitBox();
		
		appleBox.setFruit(new Apple());
		
		
		FruitBox<Banana> bananaBox = new FruitBox();
		
		bananaBox.setFruit(new Banana());
		
		FruitBox<Grape> grapeBox=new FruitBox<>();
		grapeBox.setFruit(new Grape());
		
		//제네릭을 사용하기 때문에 형변환 필요X
		Apple apple=appleBox.getFruit();
		
//		FruitBox<Toy> toybox=new FruitBox<>();
//		toyBox.setFruit(new Toy());
		
		FruitBox(Fruit) fruitBox=new FruitBox<>();
		fruitBox.setFruit(new Apple());
		
		Juice j= new Juice();
		j.makeJuice(appleBox);
		j.makejuice(bananaBox);
		
		Fruit a= new Apple();
		a=new Banana();
		a= new Grape();
//		A<String> a=new A();
//		// A<String>-> A클래스의 제네릭타임
//		//지정된다. item변수는 String item으로 사용된다.
//		a.arr item="이순신";
//		
//		A<Integer>b=new A<>();
//		b.setitem=(233);
//	}
//
//}
//
//class A<T>{
//	T item;
//	T[] arr;
//	ArrayList<T> list= new ArrayList<>();
//	
//	void setItem(T item) {
//		this.item=item;
//	}
//}
//class B{
//	int item1;
//	String item2;
//	float item3;
//	char item4;
//}
//void setItem(int item) {
//	this.item1= item1;
//}void setItem(int item) {
//	this.item2= item2;
//	void setItem(int item) {
//		this.item3= item3;
//	}void setItem(int item) {
//		this.item4= item4;
	}
}


/*
 generic
 
 -클래스 내부의 타입을 지정 하는 방법
 제네릭 타입을 표현
  T- type
  E- element
  k- key
  v- value
  N- number
 
 - 클래스에 제네릭 표현방법
 class A<T>
 -세네릭 타입은 클래스 타입만 지정할수 있다.
 A<Tea> a= new A<Tea>();
 -제한없니 클래스 라면 모두 가능하다.
 - 제네릭ㅌ타입으로 사용 가능한 클래스 제한을 두는 방법
  class A<T extends Parent>
	->parent 클래스의 자식 클래스와 parent클래스만 제네릭으로 타입지정이 가능 이외 다른클래스들은 불가
	-> 다중타입으로 제한을 설정 할 수있다
	인터페이스만 다중 타입 설정 가능, 클래스는 안됨

- 제네릭 와일드 카드 <?>
	-제네릭 타입의 한계를 보완 하기 위해 사용하는 방법
	-메서드의 배개변수 타입으로 제네릭 타입 표현되는 클래스를 사용한다면
	클래스에 표현된 제네릭이 제대로 표현되지 않기 때문에 다시한번 제네릭 지정해야 한다
	이때 사용되는 예외 없이 허용한다라고 해서 ?로 표현
	
	- 와일드 카드의제한
	<?extendsT> : T클래스와 그 자식까지 가능
	<?super t> : T클래스와 그 조상까지 가능(자식안됨)


*/
