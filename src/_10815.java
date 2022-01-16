import java.util.Arrays;
import java.util.Scanner;

public class _10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A  = new int[N];
        for(int i=0; i<N; i++) A[i]=sc.nextInt();

        Arrays.sort(A);

        int M  = sc.nextInt();
        int[] B = new int[M];
        for(int i=0; i<M; i++) B[i]=sc.nextInt();

        for(int i=0; i<M; i++) {
            int a = Arrays.binarySearch(A, B[i]);

            if(a>=0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
