
import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter thr value of "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The sorted array is:"+Arrays.toString(arr));

        
    }
    
}
