import java.util.*;
class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of product:");
        int sp=sc.nextInt();
        System.out.print("Enter the dicount percent of product:");
        int discount=sc.nextInt();
        
        System.out.println("intial price of the product is: "+sp);
        System.out.println("Discount percent on the procuct is: "+discount+"%");
        if(discount>0 && 100>discount){
            double bill = sp * (1 - (discount / 100.0));
            System.out.println("after discount the procuct price is: "+bill);
        }
        else if(discount>100){
            System.out.println(" discount not possible: "+sp);
        }
        else{
            System.out.println("No disscount on product:"+sp);
        }
        
        
    }
}