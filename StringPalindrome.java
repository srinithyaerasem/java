package java10k;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="abab";
		String ans="";
		for(int i=s.length()-1;i>=0;i--) {
			ans=ans+s.charAt(i);
		}
		if(s.equals(ans)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		System.out.println("The given string is:"+s);
		System.out.println("The reversed string is: "+ans);
	}

}
