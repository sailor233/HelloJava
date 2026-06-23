package arrayopt;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 }, // 学生甲的语数英成绩
                { 68, 72, 64 }, // 学生乙的语数英成绩
                { 95, 91, 89 }, // ...
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        int sum = 0;
        for(int i=0;i<=scores.length-1;i++) {
        	for(int j=0;j<=scores[i].length-1;j++) {
        		sum = scores[i][j]+sum;
        	}
        }
        average = sum/(3.0*scores.length);
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
	}

}
