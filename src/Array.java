
public class Array {
	public static void main(String[] args) {
		//存储5位同学的数组
		int [] ns = new int[5];
		ns[0] = 68;
		ns[1] = 79;
		ns[2] = 91;
		ns[3] = 85;
		ns[4] = 62;
		System.out.println(ns[0]);
		System.out.println("长度:"+ns.length);
		// 定义时直接初始化元素
		int [] ns3 = new int[] {1,2,3,4};
		int [] ns2 = {1,2,3,4};
		// 数组时引用类型
		
		//字符串数组
		String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"? XYZ
		
	}
}
