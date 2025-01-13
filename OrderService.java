package OrderService_Test;

public class OrderService {

	private PaymentService paymentService;
	
	public OrderService(PaymentService paymentService)
	{
		this.paymentService	= paymentService;
		
	}
	
	public String placeOrder(int amount)
	{
		if (paymentService.processPayment(amount))
		{
			return "Order Placed Successfully!";
		}
		else
		{
			return "Payment Failed!";
		}
	}
	
}
