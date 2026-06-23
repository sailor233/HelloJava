import java.util.Scanner;
import java.util.Random;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int option = 2;
//		switch(option) {
//		case 1:
//			System.out.println("selected 1");
//			break;
//		case 2:
//		case 3:
//			System.out.println("selected 2,3");
//			break;
//		default:
//			System.out.println("selected other");
//			break;
//			
//		}
//		String fruit = "defauktxx";
//		switch(fruit) {
//		case "apple" -> System.out.println("selected apple");
//		case "pear" -> System.out.println("selected pear");
//		case "mango" -> {
//			System.out.println("selected mango");
//			System.out.println("Good mango");}
//		}
		
//		int opt = switch(fruit){
//		case "apple" -> 1;
//		case "pear" -> 2;
//		default -> {
//			int code = fruit.hashCode();
//			yield code;
//		}
//			
//		};
//		System.out.println(opt);
		System.out.println("请出拳 1-石头，2-剪刀，3-布");
		Scanner sc = new Scanner(System.in); 
		int player = sc.nextInt();
		Random random = new Random();
		int pc = random.nextInt(3) + 1; 
		
		switch(pc) {
		case 1->System.out.println("电脑出拳:石头");
		case 2->System.out.println("电脑出拳:剪刀");
		case 3->System.out.println("电脑出拳:布");
		default -> System.out.println("逻辑错误，随机数字为"+pc);
		}
		int result = player-pc;
		switch(result) {
		case 0: 
			System.out.println("平局");
			break;
		case -1: 
		case 2:
			System.out.println("你赢了");
			break;
		default:
			System.out.println("你输了");
			break;
		}
		
		
	}

}

