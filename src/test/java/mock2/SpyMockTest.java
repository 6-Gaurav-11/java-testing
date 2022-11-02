package mock2;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

public class SpyMockTest {

	@Test
	public void test() {
		ArrayList spyList = Mockito.mock(ArrayList.class);
		assertEquals(0, spyList.size());
	//	doReturn(10).when(spyList).size();
		
		spyList.add("ABC");
		spyList.add("ABC");
		spyList.add("ABC");
		spyList.add("ABC");
		spyList.add("ABC");
		
		assertEquals(5, spyList.size());
		spyList.clear();
		
		verify(spyList).clear();
	}

}
