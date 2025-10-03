package java10k;

public class ContainsSubString {
	public static void main(String[] args) {
        String s1="Hi hello how are you";
        String s2 = "hello";
        if(s1.contains(s2)){
        System.out.println(s1.toUpperCase()+" contains " + s2.toUpperCase());
            
        }
        else{
            System.out.println(s1.toUpperCase()+" Does not contain "+ s2.toUpperCase()  );
        }
    }

}
