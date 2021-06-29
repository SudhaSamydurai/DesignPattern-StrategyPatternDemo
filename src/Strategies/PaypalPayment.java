package Strategies;

public class PaypalPayment implements PaymentStrategy {
	
	private String username;
	private String password;
	
	public PaypalPayment(String username, String password){
		this.username = username;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Amount "+amount +" paid by paypal option");
	}

}
