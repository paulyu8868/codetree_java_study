import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int N=sc.nextInt();
        for (int i=1;i<=N;i++){
            System.out.println(A+N*i);
        }
    }
}