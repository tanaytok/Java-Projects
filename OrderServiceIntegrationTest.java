package OrderService_Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrderServiceIntegrationTest {
	
	private PaymentService paymentService;
	private OrderService orderService;

	@BeforeEach
	void setUp() throws Exception 
	{
		paymentService = Mockito.mock(PaymentService.class);
		orderService = Mockito.mock(OrderService.class);
	}

	@Test
	void testPlaceOrder_Success() 
	{
		Mockito.when(paymentService.processPayment(100)).thenReturn(true);  // ARRANGE
		String result = orderService.placeOrder(100);                       // HER TEST SENARYOSU İÇİN 3A METODU YAZIYORUZ // ACT
		assertEquals("Order Placed Successfully!",result);					// ASSERT
	}
	
	void testPlaceOrder_Failure()
	{
		Mockito.when(paymentService.processPayment(0)).thenReturn(false); 	// ARRANGE
		String result = orderService.placeOrder(0);							// HER TEST SENARYOSU İÇİN 3A METODU YAZIYORUZ // ACT
		assertEquals("Payment Failed",result);								// ASSERT
	}

}
