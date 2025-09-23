package java10k.patterns;

public class HollowDiamond {
	public static void main(String[] args) {
		int n=3;
		
		for(int i=1;i<=n;i++){ //
	           for(int j=1;j<=n-i;j++){
	               System.out.print(" ");
	           }
	           for(int j=1;j<=i;j++) {
	        	   if(j==1||i==j) {
	        		   System.out.print("* ");
	        	   }
	        	   else {
	        		   System.out.print("  ");
	        	   }
	        		   
	           }
	           System.out.println();
	       }
		for(int i=n-1;i>0;i--){ //
			for(int j=1;j<=n-i;j++){
	               System.out.print(" ");
	           }
	           for(int j=1;j<=i;j++) {
	        	   if(j==1||i==j) {
	        		   System.out.print("* ");
	        	   }
	        	   else {
	        		   System.out.print("  ");
	        	   }
	        		   
	           }
	           System.out.println();
	       }
		
	       
	}

}
