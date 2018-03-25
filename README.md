# 软件测试 ， Lab1

## 安装 junit，hamcrest and eclemma

- 安装 junit

右键要测试的类 --> new --> JUnit Test Case ，就可以自动导入Junit，开始测试了。

![](https://images2018.cnblogs.com/blog/1348630/201803/1348630-20180325132535619-599080994.png)

- 安装 hamcrest

在新建的项目上：右键->properties->Java Build Path->Libraries->Add External JARs->选择 hamcrest-all-1.3.jar->OK。

![](https://images2018.cnblogs.com/blog/1348630/201803/1348630-20180325132835133-900330583.png)

- 安装 eclemma

菜单栏 -> Help -> Install New Software -> Add -> Local->选择下载的eclemma-2.3.3->确定->OK->Select All->Next->Finish。

![](https://images2018.cnblogs.com/blog/1348630/201803/1348630-20180325133027525-2042215184.png)

![](https://images2018.cnblogs.com/blog/1348630/201803/1348630-20180325133052155-327964645.png)


## Write a java program

- Judgeinter.java

```java
package judge;

public interface Judgeinter {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return 等边三角形；等腰三角形；普通三角形;不构成三角形
	 */
	String get_re();

}
```

- Judge.java

```java
package judge;

public class Judge implements Judgeinter {

	int a,b,c;
	
	String re = "";
	
	public Judge(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.a = i;
		this.b = j;
		this.c = k;
	}

	/* (non-Javadoc)
	 * @see judge.Judgeinter#judgetri(int, int, int)
	 */
	private int judgetri() {
		if (a+b > c && a-b < c) {
			if (a == b & b == c & c ==a ) {
				return 1;
			}else if (a == b || a == c || b == c) {
				return 2;
			}else {
				return 3;
			}
		}else {
			return -1;
		}
	}
	
	private void set_re() {
		int single = judgetri();
		if (single == 1 ) {
			re = "等边三角形";
		} else if (single == 2) {
			re = "等腰三角形";
		} else if (single == 3){
			re = "普通三角形";
		} else if (single == -1) {
			re = "不是三角形";
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("错误，无法判断！");
				e.printStackTrace();
			}
		}
	}
	
	public String get_re() {
		set_re();
		return re;
	}
	
}
```

- JudgeTest.java

```
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

```

## 测试结果

- Test

![](https://images2018.cnblogs.com/blog/1348630/201803/1348630-20180325134017718-1826486178.png)

- Coverage

![](https://images2018.cnblogs.com/blog/1348630/201803/1348630-20180325134106377-265806797.png)

![](https://images2018.cnblogs.com/blog/1348630/201803/1348630-20180325134134411-1346607449.png)