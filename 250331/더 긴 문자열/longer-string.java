import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        if (s[0].length()==s[1].length()){
            System.out.print("same");
        }else if(s[0].length()>s[1].length()){
            System.out.printf("%s %d",s[0],s[0].length());
        }else{
            System.out.printf("%s %d",s[1],s[1].length());
        }
    }
}