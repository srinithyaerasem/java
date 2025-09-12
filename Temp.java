import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        
        double fahrenheit;
        double kelvin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius:");
        double celcius = sc.nextDouble();
    
        fahrenheit = (celcius * 9/5) + 32;
        kelvin = celcius + 273.15;

        System.out.println("Given temperature in celcius is:"+celcius+"C");
        System.out.println("The temperature converted into fahrenheit: "+fahrenheit+"F");
        System.out.println("The temperature converted into kelvin: "+kelvin+"K"); 
    }
    
}
