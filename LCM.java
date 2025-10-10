package java10k;

public class LCM {
	static void isLCM(int x, int y){
        int product=x*y;
        for(int i=x;i<=product;i++){
            if(i%x==0 && i%y==0){
                System.out.println("The LCM of (" +x+ "," +y+ ") is: "+i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        LCM.isLCM(4,5);
    }

}
