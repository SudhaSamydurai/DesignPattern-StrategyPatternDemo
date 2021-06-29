package Context;

public class Item {
	
	private String itemNo;
	private int amount;
	
	public Item(String itemNo, int amount){
		this.itemNo = itemNo;
		this.amount = amount;
	}

	public String getItemNo() {
		return itemNo;
	}
	
	public int getAmount() {
		return amount;
	}
}
