package java0717_1;

public class GenericStudy1 {

	public static void main(String[] args) {
		
		FruitBox<Apple> appleBox = new FruitBox();
		
		appleBox.setFruit(new Apple());
		
		
		FruitBox<Banana> bananaBox = new FruitBox();
		
		bananaBox.setFruit(new Banana());
		
		FruitBox<Grape> grapeBox=new FruitBox<>();
		grapeBox.setFruit(new Grape());
		
		//���׸��� ����ϱ� ������ ����ȯ �ʿ�X
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
//		// A<String>-> AŬ������ ���׸�Ÿ��
//		//�����ȴ�. item������ String item���� ���ȴ�.
//		a.arr item="�̼���";
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
 
 -Ŭ���� ������ Ÿ���� ���� �ϴ� ���
 ���׸� Ÿ���� ǥ��
  T- type
  E- element
  k- key
  v- value
  N- number
 
 - Ŭ������ ���׸� ǥ�����
 class A<T>
 -���׸� Ÿ���� Ŭ���� Ÿ�Ը� �����Ҽ� �ִ�.
 A<Tea> a= new A<Tea>();
 -���Ѿ��� Ŭ���� ��� ��� �����ϴ�.
 - ���׸���Ÿ������ ��� ������ Ŭ���� ������ �δ� ���
  class A<T extends Parent>
	->parent Ŭ������ �ڽ� Ŭ������ parentŬ������ ���׸����� Ÿ�������� ���� �̿� �ٸ�Ŭ�������� �Ұ�
	-> ����Ÿ������ ������ ���� �� ���ִ�
	�������̽��� ���� Ÿ�� ���� ����, Ŭ������ �ȵ�

- ���׸� ���ϵ� ī�� <?>
	-���׸� Ÿ���� �Ѱ踦 ���� �ϱ� ���� ����ϴ� ���
	-�޼����� �谳���� Ÿ������ ���׸� Ÿ�� ǥ���Ǵ� Ŭ������ ����Ѵٸ�
	Ŭ������ ǥ���� ���׸��� ����� ǥ������ �ʱ� ������ �ٽ��ѹ� ���׸� �����ؾ� �Ѵ�
	�̶� ���Ǵ� ���� ���� ����Ѵٶ�� �ؼ� ?�� ǥ��
	
	- ���ϵ� ī��������
	<?extendsT> : TŬ������ �� �ڽı��� ����
	<?super t> : TŬ������ �� ������� ����(�ڽľȵ�)


*/
