package mock2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
	Calculator c;
	
	@Test
	public void test() {
		CalcService cs = Mockito.mock(CalcService.class);  //clone obj of CalcService
		c = new Calculator(cs);
		
		when(cs.add(1, 2)).thenReturn(3);  //dummy data stub
		assertEquals(6, c.doThis(1, 2));   // testing doThis() method
		verify(cs).add(1,2);    //checks whether add() method of CalcService is used or not
	}
}
