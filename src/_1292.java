import java.util.Scanner;

public class _1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[1000];
        int k=1;
        int cnt=0;
        int idx=0;

        while(idx<1000) {
            if(cnt<k) {
                A[idx]=k;
                cnt++;
                idx++;
            }
            else {
                cnt=0;
                k++;
            }
        }

        int N = sc.nextInt();
        int M = sc.nextInt();

        int sum=0;

        for(int i=N-1; i<=M-1; i++) sum+=A[i];
        System.out.println(sum);
    }
}
