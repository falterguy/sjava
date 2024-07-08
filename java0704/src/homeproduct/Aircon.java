package homeproduct;

public class Aircon extends House{
	
	static final String[] windText= {"미","약","강"};
	
	int wind=0;
	int temperature;
	
	
	Aircon(){}
		Aircon(String brand, int price){
			super(brand,price);
		}
		void tempUP() {
			this.temperature++;
		}
		void tempDOWN() {
			this.temperature--;
		}
		
		void windControl() {//메소드 코드 변경안됨 영향을 받지 않게 수정할때 힘듬
			wind++;
			if(wind==windText.length) wind=0;
			System.out.println("현재 바람세기:"+windText[wind]);//[wind]라는 변수로 인덱스 표현
		}

	
}