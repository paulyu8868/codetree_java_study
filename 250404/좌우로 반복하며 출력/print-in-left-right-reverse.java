import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        //int[] arr = IntStream.rangeClosed(1,10).toArrary();
        //Arrays.stream(arr).forEach(System.out::print);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            for(int j=1;j<=N;j++){
                if(i%2==0){
                    System.out.print(j);
                }
                else{
                    System.out.print(N-j+1);
                }
            }
            System.out.println();
        }
    }
}