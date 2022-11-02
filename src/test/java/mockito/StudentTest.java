package mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class StudentTest {
	 
	StudentService service = Mockito.mock(StudentService.class);
	Student st = new Student(service);
	
	@Test
	public void testAvg() {
		when(service.totalStudents()).thenReturn(10);
		when(service.totalMarks()).thenReturn(500);
		assertEquals(50, st.getAverage());
	}
	
	@Test
	public void testSub() {
		when(service.totalSubjects()).thenThrow(new RuntimeException("Runtime Exp"));
		service.totalSubjects();
	}
	
	@Test
	public void testSpy() {
		StudentService service = Mockito.spy(StudentService.class);
		doReturn(500).when(service).totalMarks();
		doReturn(10).when(service).totalStudents();
		assertEquals(50, st.getAverage());

	}

}
