import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int i=1;
        while(sum<=N){
            sum+=i;
            i++;
        }
        System.out.print(i-1);
    }
}