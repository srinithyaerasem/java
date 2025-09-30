package java10k;

public class RevString {
	public static void main(String[] args) {
		String s="Abcd";
		String ans="";
		for(int i=s.length()-1;i>=0;i--) {
			ans=ans+s.charAt(i);
		}
		System.out.println("The given string is:"+s);
		System.out.println("The reversed string is: "+ans);
	}

}
