import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		// java的输出
		System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        
        //格式化输出
        // 整数：%d  16进制：%x 小数：%f 科学计算：%e 格式化字符串：%s
        double d = 3.1415926;
        System.out.printf("%e\n", d);
        
        // 输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("\ninput name:");
//        String name = scanner.nextLine(); // 读取一行
//        System.out.print("\ninput age:");
//        int age = scanner.nextInt();
//        System.out.printf("\nhi,%s,you are %d\n", name,age);
        
        System.out.print("\n上一次的成绩为:");
        float lastScore = scanner.nextFloat();
        System.out.print("\n这一次的成绩为:");
        float currentScore = scanner.nextFloat();
        float rate = (currentScore - lastScore)/lastScore;
        System.out.printf("上次成绩：%.1f,这次成绩:%.1f,提升%.2f%%", lastScore,currentScore,rate*100);
        
	}

}
