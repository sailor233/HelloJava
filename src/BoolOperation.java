
public class BoolOperation {
	public static void main(String[] args) {
		int n = -100;
		int x = n >= 0 ? n:-n;
		System.out.print(x);
		
		
		
		int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age >= 6 & age <= 12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
	}
}
