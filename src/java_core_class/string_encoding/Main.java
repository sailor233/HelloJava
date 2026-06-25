package java_core_class.string_encoding;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public class Main {
    public static void main(String[] args)  throws UnsupportedEncodingException {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        //两个字符串比较，必须总是使用equals()方法。
        System.out.println(s1.equals(s2));
        System.out.println("Hello".contains("ll"));
        System.out.println("Hello".contains("ll"));
        System.out.println("Hello".indexOf("l"));
        System.out.println("Hello".lastIndexOf("l"));
        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".endsWith("lo"));
        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2,4));
        //trim()并没有改变字符串的内容，而是返回了一个新字符串。
        System.out.println(" \tHello\r\n".trim());

        //去除首尾空白字符
        System.out.println(" 啊倒萨 ".strip());
        //去除首部空白字符
        System.out.println(" 啊倒萨 ".stripLeading());
        //去除尾部空白字符
        System.out.println(" 啊倒萨 ".stripTrailing());

        //判断字符串为空
        System.out.println("".isEmpty());//判断字符串长度为0
        System.out.println("".isBlank());//判断字符串全是空白字符或者长度为0


        //替换字符串
        String s = "hello";
        s.replace('l','w');//返回一个新字符串，本身s指向的字符串不变
        System.out.println(s.replace('l','w'));


        //分割字符串
        String s3 = "A,B,C,D";
        String[] ss = s3.split("\\,");
        System.out.println(Arrays.toString(ss));

        //字符串拼接
        String[] arr = {"A", "B", "C"};
        String s4 = String.join("",arr);
        System.out.println(s4);

        //格式化字符串
        String s5 = "Hi %s, your score is %d!";
        System.out.println(s5.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

        //类型转换
        //1.任意基本类型转字符串
        System.out.println(String.valueOf(11));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(45.7));
        //2.字符串转数字
        int n1 = Integer.parseInt("123");
        boolean b1 = Boolean.parseBoolean("true"); // true

        //char[] 和字符串转换
        char[] cs = "Hello".toCharArray(); // String -> char[]
        System.out.println(cs.getClass().getSimpleName());
        String s6 = new String(cs); // char[] -> String


        int[] scores = new int[] { 88, 77, 51, 66 };
        Score score = new Score(scores);
        score.printScores();
        scores[2] = 99;
        score.printScores();

        byte[] b2 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b3 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
        byte[] b4 = "Hello".getBytes("GBK"); // 按GBK编码转换
        byte[] b5 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换


    }
}

class Score{
    private int[] scores;
    public Score(int[] scores){
//        this.scores = new int[scores.length];
//        for(int i = 0;i<scores.length;i++){
//            this.scores[i] = scores[i];
//        }
        this.scores = Arrays.copyOf(scores,scores.length);
    }

    public void printScores(){
        System.out.println(Arrays.toString(scores));
    }

}
