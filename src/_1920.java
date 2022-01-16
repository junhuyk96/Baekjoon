import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++) A[i]=sc.nextInt();
        Arrays.sort(A);

        int m = sc.nextInt();
        int[] B = new int[m];
        for(int i=0; i<m; i++) B[i]=sc.nextInt();

        for(int i=0; i<m; i++) {
            if(Arrays.binarySearch(A, B[i]) >= 0) System.out.println(1);
            else System.out.println();
        }
    }
}
