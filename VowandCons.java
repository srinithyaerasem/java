package java10k;

public class VowandCons {
	public static void main(String[] args) {
		String s="Nithya";
		int i=0;
		String vowel="";
		String cons="";
		int vowc=0;
		int conc=0;
		while(i<=s.length()-1) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U') {
				vowel=vowel+s.charAt(i);
				vowc++;
			}
			else {
				cons=cons+s.charAt(i);
				conc++;
			}
			i++;
		}
		System.out.println("The vowels present in the given string are: "+vowel);
		System.out.println("The count of vowels is:"+vowc);
		System.out.println("The Consonats present in the given string are: "+cons);
		System.out.println("The count of consonats is:"+conc);
	}

}
