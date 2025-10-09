package java10k;
import java.util.*;
public class Atmpin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin =1234;
		int enterpin;
		int attempt=0;
		while(attempt<3) {
			enterpin=sc.nextInt();
				if(pin==enterpin) {
					System.out.println("Now you can with draw!!! ");
					break;
				}
				else {
					System.out.println("Inccorect pin");
					attempt++;
				}
		}
		if(attempt>=2) {
			System.out.println("Your card is blocked");
		}
	}

}
