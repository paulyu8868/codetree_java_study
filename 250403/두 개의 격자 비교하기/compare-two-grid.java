import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                System.out.print((arr1[i][j]==arr2[i][j])?0:1);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}