package arrayopt;
import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
//		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//		System.out.println(Arrays.toString(ns));
//		Arrays.sort(ns);
//		System.out.println(Arrays.toString(ns));
//		String[] ns2 = { "banana", "apple", "pear" };
		
		
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        // TODO:
        
        for(int i=0;i<ns.length-1;i++) {
        	for(int j=0;j<ns.length-1-i;j++) {
        		if(ns[j]<ns[j+1]) {
        			int t = ns[j];
        			ns[j] = ns[j+1];
        			ns[j+1] = t;
        		}
        		}
        	}
        
        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }

	}
}
