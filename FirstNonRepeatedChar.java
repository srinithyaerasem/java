package Java10000.arrayslearn;

public class FirstNonRepeatedChar {
	 public static void main(String[] args) {
	        String str = "swiss";
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (str.indexOf(c) == str.lastIndexOf(c)) {
	                System.out.println("First non-repeated character: " + c);
	                return;
	            }
	        }
	        System.out.println("No non-repeated character found");
	    }

}
