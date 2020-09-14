package print;

public class Lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(print());
		bongos(4);
	}
	
	public static String print() {
	
		String boink = "Hello world! Programmed to work and not to feel...";
		return boink;
	}
	public static int bongos(int a) {
		a = 1;
		System.out.println(a);
		for (int i = 1; i < 10; i++) {
			System.out.println("boink!");
			a += 1;
			System.out.println(a);
		}
		return a;
	}

}
