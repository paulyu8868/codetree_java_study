import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N<=100){
            String grade;
            if (N>=90){
                grade = "A";
            }else if(N>=80){
                grade = "B";
            }else if(N>=70){
                grade = "C";
            }else if(N>=60){
                grade = "D";
            }else{
                grade = "F";
            }
            System.out.print(grade+" ");
            N++;
        }

    }
}