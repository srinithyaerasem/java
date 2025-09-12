import java.util.*;
public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency:");
        double cur =sc.nextDouble();
        int cur1=(int)cur;
        System.out.println("Thes currency after converting into int: "+cur1);
        byte cur2=(byte)cur;
        System.out.println("Thes currency after converting into int: "+cur2);
        
    }    
}
