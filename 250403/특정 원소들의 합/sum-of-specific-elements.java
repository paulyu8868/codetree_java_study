import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int ans = 0;
        for (int i=0;i<4;i++){
            arr[i] = Arrays
            .stream(sc.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();
        }

        for (int i=0;i<4;i++){
            ans+=Arrays.stream(arr[i]).limit(i+1).sum();
        }
        System.out.print(ans);
    }
}