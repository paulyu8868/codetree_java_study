import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        
        int[] arr=new int[10];
        arr[0]=Integer.parseInt(input[0]);
        arr[1]=Integer.parseInt(input[1]);

        for (int i=2;i<arr.length;i++){
            arr[i]=(arr[i-1]+arr[i-2])%10;
        }

        Arrays.stream(arr).forEach(i->System.out.print(i+" "));
        

    }
}