import java.util.Scanner;

public class _1927 {
    static int size = 0;

    static void downHeap(int[] A) {
        int i = 1;
        while(2 * i <= size) {
            if(A[i] < A[2*i] && (A[i] <A[2*i+1] || A[2*i+1]==-1)) break;

            int idx = 2*i;

            if(A[idx] > A[2*i+1] && A[2*i+1]!=-1) idx = 2*i+1;

            int tmp = A[i];

            A[i] = A[idx];
            A[idx] = tmp;
            i = idx;
        }
    }

    static void insert(int[] A, int value) {
        A[++size] = value;

        int idx = size;

        while(idx!=1) {
            if(A[idx] < A[idx/2]) {
                int tmp = A[idx];
                A[idx] = A[idx/2];
                A[idx/2]=tmp;
                idx/=2;
            }
            else break;
        }

        downHeap(A);
    }

    static int delete(int[] A) {
        if(size==0) return 0;

        int min = A[1];
        A[1]=A[size];
        A[size--]=-1;
        downHeap(A);

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[100000];
        for(int i=0; i<100000; i++) A[i]=-1;

        for(int i=0; i<N; i++) {
            int k = sc.nextInt();

            if(k > 0) insert(A, k);
            else {
                System.out.println(delete(A));
            }
        }
    }
}
