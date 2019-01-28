package Hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("In Before Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("In Before After all");
	}
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("In Before Before all");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("In Before After all");
	}

	@Test
	void test() {
		System.out.println("Pama Pama ANupama");
	}
	@Test
	void test1() {
		System.out.println("Shika Shika Kowshika");
	}
	@Test
	void test2() {
		System.out.println("Di DI Nidhi");
	}
	@Test
	void test3() {
		System.out.println("Kar Kar SaiSankar");
	}
	
}
