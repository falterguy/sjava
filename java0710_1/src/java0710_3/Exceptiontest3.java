package java0710_3;

public class Exceptiontest3 {

	public static void main(String[] args) {
		
		try {
			//�ڵ�
			if()
				throw new NullPointerException("aa");
			
			
		}catch(Exception e) {
			System.out.println("���� ���� �߻�");
		}

	}

}

class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name=name;
		this.birth=birth;
	}
	
	void setAge() {
		this.age=2024-birth;
	}
}