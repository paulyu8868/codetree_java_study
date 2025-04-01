import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int cnt =0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] fr = {
        "apple",
        "banana",
        "grape",
        "blueberry",
        "orange"
        };
        for (String str:fr){
            String str3 =String.valueOf(str.charAt(2));
            String str4 =String.valueOf(str.charAt(3));
            if (str3.equals(s)||str4.equals(s)){
                System.out.println(str);
                cnt++;
            }
            
        }
        System.out.println(cnt);






    }
}