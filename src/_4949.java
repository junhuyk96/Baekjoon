import java.util.Scanner;
import java.util.Stack;

public class _4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        String str;

        while(true) {
            str = sc.nextLine();
            if(str.equals(".")) break;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i)== '(' || str.charAt(i)=='[') {
                    st.push(str.charAt(i));
                }
                else if(str.charAt(i)==']' || str.charAt(i)==')') {
                    if(!st.empty()) {
                        if(st.peek()=='(' && str.charAt(i)==')') st.pop();
                        else if(st.peek()=='[' && str.charAt(i)==']') st.pop();
                        else st.push(str.charAt(i));
                    }
                    else st.push(str.charAt(i));
                }
            }

            if(st.size()==0) System.out.println("yes");
            else System.out.println("no");

            st.clear();
        }
    }
}
