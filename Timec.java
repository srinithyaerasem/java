import java.util.*;
public class Timec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter totla no.of seconds:");
        int sec= sc.nextInt();
        int min = sec/60;
        int hr = min/60;
        while (min>=60 || sec >= 60) {
            if(min >= 60){
                min= min-60;
            }
            if(sec >= 60){
                sec = sec-60;
            }
        }
        System.out.println(hr+"hr "+min+" min "+sec+" sec");

    }
    
}
