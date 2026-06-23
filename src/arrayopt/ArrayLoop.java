package arrayopt;
import java.util.Arrays;

public class ArrayLoop {
	public static void main(String[] args) {
		int[] ns = { 1, 4, 9, 16, 25 };
		for(int n:ns) {
			System.out.println( n);
		}
		
		System.out.println(Arrays.toString(ns));
		
		
        // 倒序打印数组元素:
        for (int i=ns.length-1;i>=0;i--) {
            System.out.println(ns[i]);
        }
	}

}
