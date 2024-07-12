package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
	
	ArrayList<Asset> list=new ArrayList<>();
	
	list.add(new Asset("우리은행",3450000,"1004-91-123455","이순신"));
	list.add(new Asset("농협은행",513350,"34-123-349393","김유신"));
	list.add(new Asset("신한은행",891003,"394-3412-2323","박팽년"));
	list.add(new Asset("국민은행",899900,"39-2384-19939","최무선"));
	list.add(new Asset("우리은행",28300,"1002-93-878888","문익점"));
	list.add(new Asset("신한은행",98000,"293-0123-1234","이율곡"));
	list.add(new Asset("우리은행",1920000,"1006-23-123456","김시민"));
	list.add(new Asset("국민은행",932000,"23-2555-29991","이율곡"));
	
	System.out.println(list);
	System.out.println("\n====우리은행을 이용하는 사람====");
	
	for(Asset b:list) {
		if(b.getBank().equals("우리은행")) {
			System.out.println(b);	
		}
		
	}
	System.out.println("\n====우리은행을 이용하는 사람====");
	list.forEach(백만->{
		if(백만.getBalance()>=1000000) {
			System.out.println(백만);
		}
	}
			
	);
	
//	list.forEach(a->실행코드);
//	list.forEach(a->{실행코드; 실행코드;});
	
	System.out.println("\n==== 우리은행 계좌 개설====");
	
	Asset asset=new Asset("우리은행",0,"1007-23-128954","최무선");
	if( !list.contains(asset)) {
		list.add(asset);
	}
	
	list.forEach(info ->System.out.println(info));
	}

}
