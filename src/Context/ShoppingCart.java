package Context;

import java.util.ArrayList;
import java.util.List;

import Strategies.PaymentStrategy;

public class ShoppingCart {
	
	List<Item> items;
	PaymentStrategy paymentStrategy;
	
	public ShoppingCart(){
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void deleteItem(Item item) {
		items.remove(item);
	}
	
	public int totalAmount() {
		int sum = 0;
		for(Item item: items)
			sum += item.getAmount();
		return sum;
	}
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void pay() {
		int amount = totalAmount();
		paymentStrategy.pay(amount);
	}

}
