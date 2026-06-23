
public class FloatDouble {
	public static void main(String[] args) {
//		double x = 1.0 / 10;
//        double y = 1 - 9.0 / 10;
//        // 观察x和y是否相等:
//        System.out.println(x);
//        System.out.println(y);
//        
//        
//        
//        //类型提升
//        int n = 5;
//        double d = 1.2 + 24.0/n; //24.0是浮点数，所以n就变成5.0，所以24.0/5.0为4.8
//        System.out.println(d); //6.0
//        
//        double d2 = 1.2 + 24/n; // 24/5 整数计算只取整数4
//        System.out.println(d2); //5.2
//        
//        //溢出
//        //整数除以0报错
////        int a = 5/0;
////        System.out.println(a);  //Exception in thread "main" java.lang.ArithmeticException: / by zero
//        //浮点数除以0不报错
//        double b = 0.0/0;  //NaN
//        System.out.println(b);
//        
//        
//        double c = 1.0/0;  //Infinity 无穷大
//        System.out.println(c);
//        
//        double e = -1.0/0;  //-Infinity 负无穷大
//        System.out.println(e);
//        
        
		double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        // TODO:
        double r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
        
	}
}
