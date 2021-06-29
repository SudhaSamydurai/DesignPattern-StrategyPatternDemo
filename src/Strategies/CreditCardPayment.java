package Strategies;

public class CreditCardPayment implements PaymentStrategy{
	
	private String ccNumber;
	private String name;
	private String cvv;
	private String expiryDate;
	
	public CreditCardPayment(String ccNumber, String name, String cvv, String expiryDate){
		this.ccNumber = ccNumber;
		this.name = name;
		this.cvv=cvv;
		this.expiryDate=expiryDate;
	}
	
	@Override()
	public void pay(int amount) {
		System.out.println("Amount "+amount +" paid by cc is successful");
	}
	
}
