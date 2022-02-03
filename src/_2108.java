import java.awt.color.ColorSpace;
import java.lang.reflect.Array;
import java.util.*;

public class _2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[8001];
        int min = 0, max = 0;
        double sum = 0;


        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            if(i==0) {min=max=A[i];}
            else {
                if(min > A[i]) min = A[i];
                if(max < A[i]) max = A[i];
            }
            sum += A[i];
            if(A[i] < 0) B[A[i]*(-1)+4000]+=1;
            else B[A[i]]+=1;
        }

        int m=0;
        for(int i=0; i<8001; i++) {
            if(B[i]>m) m = B[i];
        }

        Vector<Integer> v = new Vector<>();

        for(int i=0; i<8001; i++) {
            if(m == B[i]) {
                if(i>4000) v.add((i-4000)*(-1));
                else v.add(i);
            }
        }

        Collections.sort(v);


        Arrays.sort(A);
        int avg;
        if(sum >= 0) avg = (int) (sum/A.length + 0.5);
        else avg = (int) (sum/A.length - 0.5);

        System.out.println(avg);
        System.out.println(A[A.length/2]);
        if(v.size()==1) System.out.println(v.get(0));
        else System.out.println(v.get(1));
        System.out.println(max-min);
    }
}
