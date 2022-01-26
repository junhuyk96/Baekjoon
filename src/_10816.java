import java.util.Arrays;
import java.util.Scanner;

public class _10816 {

    static int lower_bound(int A[], int k) {
        int l = 0;
        int r = A.length;

        while(l<r) {
            int m = (l + r) / 2;

            if(k <= A[m]) r = m;
            else l = m + 1;
        }
        if(l >= A.length || A[l] != k) return -1;
        return l;
    }

    static int upper_bound(int A[], int k) {
        int l = 0;
        int r = A.length;

        while(l<r) {
            int m = (l + r) / 2;

            if(k < A[m]) r = m;
            else l = m + 1;
        }
        if(l-1 >= A.length || A[l-1] != k) return -1;
        return l-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++) A[i] = sc.nextInt();

        int M = sc.nextInt();

        Arrays.sort(A);

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++) {
           int k = sc.nextInt();

           if(lower_bound(A, k)==-1) sb.append(0).append(' ');
           else sb.append(upper_bound(A, k) - lower_bound(A, k) + 1).append(' ');
        }

        System.out.println(sb);
    }
}
