import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        System.out.print(s.charAt(0));
        System.out.print("a");
        System.out.print(s.substring(2,l-2));
        System.out.print("a");
        System.out.print(s.charAt(l-1));

    }
}