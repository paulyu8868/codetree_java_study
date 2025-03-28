import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        while (true){
            if (N!=0){
                System.out.println(N);
            }else{
                break;
            }
            N=(int)N/M;
        }
        // Please write your code here.
    }
}
