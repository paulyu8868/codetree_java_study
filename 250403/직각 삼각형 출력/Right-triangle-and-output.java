import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i=0;i<N;i++){
            for (int j=0;j<(i*2+1);j++){
                System.out.print("*");    
            }
            System.out.println();
        }
    }
}