import java.util.*;

public class Main {
    private static final int ANS = 25;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);
        while (true){
            int num = Integer.parseInt(sc.nextLine());
            //System.out.println(num);
            if (num==ANS){
                System.out.println("Good");
                break;
            }else if(num>ANS){
                System.out.println("Lower");
            }else{
                System.out.println("Higher");
            }
        }
    }
}