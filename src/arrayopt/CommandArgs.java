package arrayopt;

public class CommandArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String arg:args) {
			if(arg.contains("version")) {
				System.out.println("6.6.6");
			}
		}
	}

}
