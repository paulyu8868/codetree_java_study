import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<4;i++){
        int sum = Arrays.
        stream(sc.nextLine().split(" ")).
        mapToInt(Integer::parseInt).
        sum();
        System.out.println(sum);
        }
    }
}