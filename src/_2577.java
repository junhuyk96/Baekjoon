import java.util.Scanner;

public class _2577 {
    static int[] num = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int D = A * B * C;

        do {
            num[D%10]+=1;
            D/=10;
        } while(D!=0);

        for(int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }
}


