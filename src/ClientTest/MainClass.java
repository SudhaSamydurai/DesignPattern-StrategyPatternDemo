package ClientTest;

import Context.Item;
import Context.ShoppingCart;
import Strategies.CreditCardPayment;
import Strategies.PaypalPayment;

public class MainClass {

	public static void main(String[] args) {
		
		Item item1 = new Item("123", 10);
		Item item2 = new Item("456", 20);

		ShoppingCart order = new ShoppingCart();
		order.addItem(item1);
		order.addItem(item2);
		
		order.setPaymentStrategy(new CreditCardPayment("123456789", "Sudha", "123", "1212"));
		order.pay();
		
		order.setPaymentStrategy(new PaypalPayment("123456789", "Sudha"));
		order.pay();
	}

}
