import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] numbers = sc.nextLine().split(" ");
        for (int i=N-1;i>-1;i--){
            int num = Integer.parseInt(numbers[i]);
            //System.out.print(num);
            if (num%2==0)
                System.out.print(num+" ");
        }
    }
}