import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            int sum = 0;

            for(int j=0; j<num; j++) {
                arr[j] = sc.nextInt();
                sum+=arr[j];
            }

            double avg = (double) sum / num;
            int cnt = 0;

            for(int j=0; j<num; j++) {
                if(avg < arr[j]) cnt++;
            }
            double res = (double) cnt / num;
            res*=100;
            res = Math.round(res * 1000) / 1000.0;

            System.out.printf("%.3f%%\n", res);
        }
    }
}
