import java.util.Scanner;

public class _1927 {
    static int size = 0;

    static void insert(int[] A, int value) {
        A[++size] = value;

        int idx = size;

        while(idx!=1) {
            int tmp = A[idx];
            A[idx] = A[idx/2];
            A[idx/2] = tmp;
        }
    }

    static int delete(int[] A) {
        if(size==0) return 0;

        int min = A[1];
        A[1] = A[size--];

        int i = 1;

        while(2 * i <= size) {
            int tmp = A[i];

            if(A[i] < A[2*i] && A[i] < A[2*i+1]) break;
            else if(A[i] > A[2*i] && A[i] < A[2*i+1]) {
                A[i] = A[2*i];
                A[2*i] = tmp;
            }
            else if()
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    }
}
