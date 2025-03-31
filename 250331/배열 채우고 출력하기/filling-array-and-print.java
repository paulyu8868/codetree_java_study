import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        for (int i=s.length-1;i>-1;i--){
            System.out.print(s[i]);
        }
    }
}