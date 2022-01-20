import java.util.Arrays;
import java.util.Scanner;

public class _1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        long min = 1;
        long max = 0;

        int[] A = new int[K];

        for(int i=0; i<K; i++) {
            A[i] = sc.nextInt();
            if(max < A[i]) max = A[i];
        }

        while(min <= max) {
            long mid = (min + max) / 2;
            long count = 0;

            for(int i=0; i<K; i++) count += (A[i] / mid);

            if(count < N) {
                max = mid-1;
            }
            else {
                min = mid + 1;
            }
        }

        System.out.println(min-1);
    }
}
