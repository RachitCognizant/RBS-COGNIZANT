package test.java;

import static org.junit.Assert.assertEquals;
import main.java.Basket;

import org.junit.Before;
import org.junit.Test;

public class BasketTestCase {

	@Before
	public void setUp() throws Exception {
	
		
			
	}
	
	 @Test
	   public void testAdd() {
	      
        assertEquals(12.0,Basket.basketTotalCost(Basket.createBasket()), 0.00);
	      
	   }

}
