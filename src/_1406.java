import java.util.Scanner;
import java.util.Stack;

public class _1406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        String str = sc.nextLine();
        String a="";
        int n = sc.nextInt();

        sb.append(str);
        int cursor=sb.length();

        for(int i=0; i<n; i++) {
            char op = sc.next().charAt(0);
            if(op=='L') {
                if(cursor!=0) cursor--;
            }
            else if(op == 'D') {
                if(cursor!=str.length()) cursor++;
            }
            else if(op == 'B') {
                if(cursor!=0) sb.deleteCharAt(--cursor);
            }
            else if(op == 'P') {
                a=sc.next();
                sb.insert(cursor, a);
            }

            System.out.println(sb + " " + cursor);
        }

        System.out.println(sb);
    }
}
