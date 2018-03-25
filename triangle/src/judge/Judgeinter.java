package judge;

public interface Judgeinter {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return 1-》等边三角形；2-》等腰三角形；3-》普通三角形，-1-》不构成三角形
	 */
	String get_re();

}