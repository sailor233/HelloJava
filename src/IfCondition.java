
public class IfCondition {

	public static void main(String[] args) {
		int n = 59;
		if(n>=90) {
			System.out.println("优秀");
		}
		else if(n >=80) {
			System.out.println("良好");
		}
		else if(n >=60) {
			System.out.println("一般");
		}
		else {
			System.out.println("不合格");
		}
		
		
		// 浮点数判断需要判断差值小于临界值
		double x = 1 - 9.0/10;
		System.out.println(x);
		if(Math.abs(x-0.1) < 0.000000000001) {
			System.out.println("x is 0.1");
		}else {
			System.out.println("x is NOT 0.1");
		}

	}

}
