import java.util.Scanner;
import java.util.Stack;

public class _10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        int K = sc.nextInt();

        for(int i=0; i<K;i++) {
            int n=sc.nextInt();

            if(n!=0) {
                stack.push(n);
            }
            else {
                stack.pop();
            }
        }

        while(!stack.empty()) {
            sum+=stack.pop();
        }

        System.out.println(sum);

        sc.close();
        stack.clear();
    }
}
