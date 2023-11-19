import java.util.Scanner;
public class EvenOdd {
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = 4;
		System.out.println("enter the no");
		
		
		String res = (num % 2 == 0) ? "even" : "odd";
		
		System.out.println(res);
	}

}
