
public class VariableDataType {
	public static void main(String[] args) {
		// int 4字节-2147483648 ~ 2147483647
		// 21亿左右
		int i = 2147483647;
		int i2 = -2147483448;
		int i3 = 2_000_000_000;
		int i4 = 0xff000;
		int i5 = 0b1000000;
		
		long n1 = 900000000000L;
		long n2 = 900;
		int i6=900;
		
		
		//浮点数 4字节，10^38
		float f1 = 3.14f; //注意有个f结尾
		float f2 = 3.14e38f; //3.14*10^38
		//float f3 = 1.0; //不带f的默认是double类型，不可赋值给float
		
		//8字节，10^308
		double d = 1.79e308;
		double d3 = 4.9e-324; //科学记数法表示4.9*10^-324
		
		
		//布尔类型
		boolean b1 =true;
		boolean b2 = false;
		boolean isGreater = 5 > 3; //true
		int age = 12;
		boolean isAdult = age >= 18; //false
		
		//字符类型:字母和Unicode字符均可表示
		// 单引号
		char a = 'A';
		char zh = '中';
		System.out.println(a);
		System.out.println(zh);
		
		// 引用类型--存地址
		String s = "hello";
		
		//常量 final 修饰
		final double PI = 3.14;
//		PI = 4; //会报错，定义初始化后不可修改
		
		// var关键字
		StringBuilder sb = new StringBuilder();
		var sb2 = new StringBuilder();

		
		
		
		
	}

}
