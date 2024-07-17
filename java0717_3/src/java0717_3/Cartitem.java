package java0717_3;

public class Cartitem <T extends Product> {
	 private T item;
	 private int quantity;
	
	 public CartItem(T item, int quantity) {
		 this.item=item;
		 this.quantity=quantity;
	 }
	 
	public void setItem(T item) {
		this.item = item;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	
	@Override
	public String toString() {
		return "장바구니:"+quantity+","+item+",수량:"+toString();
	}
	public int getQuantity() {
		return quantity;
	}
	public T getItem() {
		return this.item;
	}
	
}
