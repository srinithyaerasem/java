package java10k;

public class CountOfEvenOdd {
	static void isCount(int n){
        int even=0;
        int odd =0;
        for(;n>0;){
            int dig= n%10;
            
            n/=10;
            if(dig%2==0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("count of even digits is "+even+ " count of odd digits is  :"+odd);
    }
    public static void main(String[] args) {
    	CountOfEvenOdd.isCount(482135);
    }

}
