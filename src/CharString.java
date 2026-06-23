
public class CharString {
	public static void main(String[] args) {
		int n1 = 'A';
		int n2 = '中';
		System.out.println(n1); //65
		System.out.println(n2); //20013
		
		char c3 = '\u0041'; // 16进制
		System.out.println(c3);
		
		
		String s = "ABC\n\u4e2d\u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文
		System.out.println(s);
		
		
		
        String s2 = """
                SELECT * FROM
                  users
               WHERE id > 100
                ORDER BY name DESC""";
       System.out.println(s2);
      
      //字符串不可变
       String s3 = "hello"; // s3 指向hello
       String t = s3; // t指向hello
       s3 = "world"; // s3指向world
       
       System.out.println(s3);// world
       System.out.println(t); // 还是hello
       
       // 空值null
       String s4 = null; //表示变量不指向任何对象
       String s5 = s4; //s5也不指向任何对象
       String s6 = ""; // s6指向空字符串对象
      
       
       //请将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串：
       int a = 72;
       int b = 105;
       int c = 65281;
       // FIXME:
       String s7 =""+ (char)a + (char)b + (char)c;
       System.out.println(s7);
       
	
	}
	
}
