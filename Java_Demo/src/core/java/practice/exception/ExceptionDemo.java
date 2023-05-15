package core.java.practice.exception;
public class ExceptionDemo {

	int num = 0;
	int res;

	public int divide() {
		try {
			res = num / 5;
		} catch (Exception e) {
			e.printStackTrace();
			//StackTraceElement elements[] = cause.getStackTrace();
			System.out.println(e);
		}
		return res;
	}
}
