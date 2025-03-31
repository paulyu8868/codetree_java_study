import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] numbers = sc.nextLine().split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i=0; i<numbers.length;i++){
            intNumbers[i] = (int)Math.pow(Integer.parseInt(numbers[i]),2);
            System.out.print(intNumbers[i]+" ");
        } 
    }
}