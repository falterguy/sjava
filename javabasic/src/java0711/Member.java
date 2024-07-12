package java0711;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	private String birth;
	
	public Member(String name, int age, String birth) {
		this.name=name;
		this.age=age;
		this.birth=birth;
	}
	
	@Override
	public String toString() {
		return name+","+age+","+birth;
	}
	
	@Override
	public boolean equals(Object o) {//어떤데이터로 비교할 것인가?
		Member tmp=(Member)o;
		boolean isSame = this.age==tmp.age;
		if(isSame)
			isSame=this.name.equals(tmp.name);
		if(isSame)
			isSame=this.birth.equals(tmp.birth);
		return isSame;
		
//	return this.age == tmp.age; //나이 비교	
//	return this.name.equals(tmp.name); //이름 비교
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	@Override
	public int compareTo(Member o) {
		//return (this.age - o.age)*-1; 	// o.age-this.age
//			return this.name.compareTo(o.name);
		
		//	return this.age - o.age; 나이기준 정렬
	
	// 나이기준 오름차순 나이같으면 이름 기준 내림차순
		int cmp= this.age - o.age ; //나이 먼저 오름차순 
		if(cmp==0)
			cmp=this.name.compareTo(o.name)*-1;
		return cmp; //이름 내림차순
	}
	
}
