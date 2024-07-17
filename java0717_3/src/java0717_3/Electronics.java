package java0717_3;

public class Electronics extends Product{
	private String brand;
	
	public Electronics(String brand) {
		super(brand);
		this.brand=brand;
	}
	
	@Override
	public String toString() {
		return super.toString()+",ºê·£µå:"+brand;
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
