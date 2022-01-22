import java.util.Scanner;

public class _2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();
        int M =sc.nextInt();
        long max = 0;

        int[] A = new int[N];

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            if(max < A[i]) max = A[i];
        }

        long min = 0;

        while(min<=max) {
            long mid = (min + max) / 2;

            long sum = 0;

            for(int i=0; i<N; i++) {
                if(A[i] >= mid) sum+=A[i]-mid;
            }

            if(sum >= M) {
                min = mid + 1;
            }
            else {
                max = mid - 1;
            }
        }

        System.out.println(min - 1);
    }
}
