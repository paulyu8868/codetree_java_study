import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max,min,middle;
        if ((a>b)&&(a>c)){
            max=a;
            if (b>c){
                middle=b;
                min = c;
            }else{
                middle=c;
                min=b;
            }
        }else if((b>a)&&(b>c)){
            max=b;
            if (a>c){
                middle=a;
                min = c;
            }else{
                middle=c;
                min=a;
            }
        }else{
            max=c;
            if (a>b){
                middle=a;
                min = b;
            }else{
                middle=b;
                min=a;
            }
        }
    System.out.print(middle);
    }
}