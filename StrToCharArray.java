package java10k;

public class StrToCharArray {
	public static void main(String[] args) {
		String s= "Nithya";
		int len = s.length();
		char arr[] = new char[len];
		for(int i=0;i<len;i++) {
			arr[i]=s.charAt(i);
		}
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
