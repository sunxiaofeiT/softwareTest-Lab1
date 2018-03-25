package Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import judge.Judge;

class JudgeTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("测试开始");
	}

	@Test
	void test1() {
		Judge judge = new Judge(1,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("不是三角形",result);
	}
	
	@Test
	void test2() {
		Judge judge = new Judge(2,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("等腰三角形",result);
	}
	
	@Test
	void test3() {
		Judge judge = new Judge(5,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("不是三角形",result);
	}
	
	@Test
	void test4() {
		Judge judge = new Judge(6,6,6);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("等边三角形",result);
	}
	
	@Test
	void test5() {
		Judge judge = new Judge(4,2,3);
		String  result = judge.get_re();
		System.out.println(result);
		assertEquals("不是三角形",result);
	}

}
