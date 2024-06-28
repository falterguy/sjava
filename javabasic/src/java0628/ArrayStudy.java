package java0628;

import java.util.Arrays;

public class ArrayStudy {

	public static void main(String[] args) {
//		배열- 같은 데이터 타입 데이터가 저장되는 공간이 연속적으로 되어있는 구조
		
	int[] a = {10,20,30};//괄호가 다름 자바는 중괄호
	System.out.println(a[0]+" "+a[1]);
	
	int b[]= {30,40,50};
	
	System.out.println( Arrays.toString(a) );
	
	
	int[] arr= new int[10];
	//배열의 공간 10개 생성
	int[] brr= new int[] {10,20,30,40}; //데이터를 갖고있다 하면 배열 ,정적배열
	
//	int[] arr2=new int[]; // 반드시 몇개공간을 만들거냐 해줘야함
	//크기지정해야함
	int size=15;
	int[] arr2= new int[size];
	
	System.out.println(arr2[0]);
	
//	배열 생성 방법
//	데이터타입[] 배열이름 =new 데이터타입[배열크기];
	int[]money=new int[5]; //5개의 int타입 공간을 가진 배열
	money[0]=5000;
	money[1]=12000;
	money[2]=4000;
	money[3]=43000;
	money[4]=50000;
	
	//10000이상의 값 출력
	for(int i=0; i<money.length; i++) {
		if(money[i]>=10000) {
		System.out.println(money[i]);
	   }
	}
	
	int[] A반 = new int[3];
	A반[0]=89; A반[1]=78; A반[2]=93;
	
	int[] B반 = new int[3];
	B반[0]=56; B반[1]=84;
	B반[2]=72;
	
	System.out.println("A반 성적:"+Arrays.toString(A반));
	System.out.println("B반 성적:"+Arrays.toString(B반));
	//	A반, B반 성적 중에서 80점 이상만 출력
	for(int i=0; i<A반.length; i++ ) {
		if(A반[i]>=80)
			System.out.println(A반[i]);//두반의 배열의 크기가 같아서 하나만 써도 됨
	
		if(B반[i]>=80)
			System.out.println(B반[i]);
	}
	
	int[] 일학년 = new int[A반.length+B반.length];
//복사할배열, 복사시작인덱스,저장할배열,자장위치인덱스,몇개?
	System.arraycopy(A반,0,일학년,0,A반.length); //배열 복사
	System.arraycopy(B반,0,일학년,3,B반.length);
	
	for(int i=0; i<일학년.length; i++) {
		if(일학년[i]>=80)
			System.out.println(일학년[i]);
	}
	
	Arrays.sort(일학년);
	System.out.println(Arrays.toString(일학년) );
	
	boolean same=Arrays.equals(A반, B반);
	System.out.println("A반,B반 배열이 같은가?"+same);
	
	
	
	
//	for(int i=0; i<A반.length; i++) {
//		
//		일학년[i]=A반[i];
//		일학년[i+3]=B반[i];
//	}
	
	

//	for( int i=0; i< 일학년.length ;i++) {
//		if(i<3)
//			일학년[i]=A반[i];
//		else
//			일학년[i]=B반[i-3];
//	}
	
	
	
	
	}
}