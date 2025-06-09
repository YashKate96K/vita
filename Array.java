
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        System.out.println("hello");
        int arr[] = new int[5] ;
        for(int i=0;i<arr.length ;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length ;i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
