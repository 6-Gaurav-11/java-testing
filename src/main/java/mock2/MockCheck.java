package mock2;

public class MockCheck {
	private int quantity;
	private String item;

	MockCheck(){}
	MockCheck(int quantity, String item){
		this.quantity=quantity;
		this.item=item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getMock() {
		return (quantity + " " + item);
	}

}
