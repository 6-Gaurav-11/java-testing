package mock2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class MockCheckTest {
	
	@Test
	public void testMock() {
		MockCheck mock = Mockito.mock(MockCheck.class);
		when(mock.getQuantity()).thenReturn(100);   //set behaviour
		when(mock.getItem()).thenReturn("XYZ");     //set behaviour
		when(mock.getMock()).thenCallRealMethod();   //calls real method
		assertEquals(100, mock.getQuantity());
	}
	
	@Test
	public void testSpy() {
		MockCheck mock = new MockCheck();
		MockCheck spyobj = Mockito.spy(mock);
	//	when(mock.getQuantity()).thenReturn(200); //set behaviour
		spyobj.setItem("ABC");
		spyobj.setQuantity(50);
		verify(spyobj);
		assertEquals("ABC", spyobj.getItem());
		assertEquals(50, spyobj.getItem());
		
	}

}
