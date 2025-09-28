import java.util.*;
public class EvenOrOdd{
	public static void main(String[] args){
		boolean result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		if(a%2==0){
			result=true;
		}else{
			result=false;
		}
		System.out.println(result);
	}
}

		 