import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        int B  = sc.nextInt();
        int num = A;
        while (num<=B){
            System.out.print(num+" ");
            if (num%2==1){
                num*=2;
            }else{
                num+=3;
            }
        }
    }
}

