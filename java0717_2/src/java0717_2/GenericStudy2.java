package java0717_2;

import java.util.ArrayList;

public class GenericStudy2 {

	public static void main(String[] args) {
		ArrayList<Book> book=new ArrayList<>();
		ArrayList<DVD> dvd=new ArrayList<>();
		
		book.add(new Book("B1234","자바완전정복","김동형"));
		book.add(new Book("F9238","스프링프레임워크","이상민"));
		book.add(new Book("B5348","포켓몬골드완전정복","유재학"));
		dvd.add(new DVD("M6751","왕의남자","김민지"));
		dvd.add(new DVD("M1637","황비홍","이유진"));
		dvd.add(new DVD("M8348","빈수레가 요란하다","차승원"));

		//대여하기
		Library lib= new Library();
		lib.addRental(book.get(0),"이순신" );
		lib.addRental(dvd.get(2),"김춘추" );
		lib.showRentalList();
		
		
		Rental<DVD> rent=new Rental<>(dvd.get(0), "이순신");
		System.out.println(rent);
		
		Rental<Book> brent=new Rental<>(book.get(1),"김춘추");
		System.out.println(brent);
		
		
		
		
		
	}

}
