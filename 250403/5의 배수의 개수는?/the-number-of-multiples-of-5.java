import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int ans =0;
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<16;i++){
            if (sc.nextInt()%5==0){
                ans++;
            }
        }

        System.out.print(ans);
    }
}