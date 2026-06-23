
public class DoWhileLoop {

	public static void main(String[] args) {
		int sum = 0;
		int  n= 1;
		do {
			sum += n;
			n++;
		}while(n<=100);
		System.out.println(sum);
		
		int sum2 = 0;
        int m = 20;
		int n2 = 100;
		// 使用do while计算M+...+N:
		do {
			sum2=sum2+m;
			m++;
		} while (m<=n2);
		System.out.println(sum2);
		
		
	}

}
