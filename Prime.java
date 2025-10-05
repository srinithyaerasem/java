package java10k;

public class Prime {
	public static void main(String[] args) {
		int c=0;
		for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
				c++;
			}
			
		}
		System.out.println("the count of prime numbers present between 1 t0 100 is: "+c);
	}

}
