import java.util.Scanner;

public class _10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];

        for(int i=0; i<3; i++) A[i] = sc.nextInt();

        int res = 0;

        if(A[0] < A[1]) {
            if(A[1] < A[2]) res = A[1];
            else if(A[0] > A[2]) res = A[0];
            else res = A[2];
        }
        else {
            if(A[0] < A[2]) res = A[0];
            else if(A[1] < A[2]) res = A[2];
            else res = A[1];
        }

        System.out.println(res);
    }
}
