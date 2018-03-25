package Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import judge.Judge;

class JudgeTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("���Կ�ʼ");
	}

	@Test
	void test1() {
		Judge judge = new Judge(1,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("����������",result);
	}
	
	@Test
	void test2() {
		Judge judge = new Judge(2,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("����������",result);
	}
	
	@Test
	void test3() {
		Judge judge = new Judge(5,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("����������",result);
	}
	
	@Test
	void test4() {
		Judge judge = new Judge(6,6,6);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("�ȱ�������",result);
	}
	
	@Test
	void test5() {
		Judge judge = new Judge(4,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("����������",result);
	}

}
