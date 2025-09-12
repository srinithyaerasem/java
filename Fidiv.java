import java.util.*;
public class Fidiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value1: ");
        float a= sc.nextFloat();
        System.out.print("Enter the value2: ");
        float b = sc.nextFloat();
        
        float div = a/b;
        System.out.println("Normal division performed on 2 floating values: "+div);
        int c = (int)a;
        System.out.println(a+" value1 after conevrting into integer is: "+c);
        int d = (int)b;
        System.out.println(b+" value2 after conevrting into integer is: "+d);
        int divint=c/d;
        System.out.println("Normal division performed on 2 floating values which are converted into Integers is: "+divint);
        
        int div2=(int)div;
        System.out.println("Conerting the remainder of division performed on 2 floating values into integers: "+div2);
    }
    
}
