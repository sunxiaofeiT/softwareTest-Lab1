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
			re = "�ȱ�������";
		} else if (single == 2) {
			re = "����������";
		} else if (single == 3){
			re = "��ͨ������";
		} else if (single == -1) {
			re = "����������";
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("�����޷��жϣ�");
				e.printStackTrace();
			}
		}
	}
	
	public String get_re() {
		set_re();
		return re;
	}
	
}
