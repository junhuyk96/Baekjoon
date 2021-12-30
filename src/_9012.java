import java.util.Scanner;
import java.util.Stack;


public class _9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner 사용
        Stack<Character> stack = new Stack<>(); //Stack 사용
        String line; // 문장 입력

        int T;
        T = sc.nextInt();
        sc.nextLine(); // 개행문자 제거

        for(int i=0; i<T; i++) {
            line = sc.nextLine();
            for(int j=0; j<line.length(); j++) {
                if(stack.isEmpty()) stack.push(line.charAt(j)); // 스택이 비어 있으면 원소 추가
                else {
                    if(line.charAt(j) == '(') stack.push(line.charAt(j)); // '('인 경우  스택 추가
                    else if (stack.peek()=='(') stack.pop(); /*
                    '('이 아니고 스택 최상위 값이 ')'이면 pop 실행*/
                }
            }

            if(stack.isEmpty()) System.out.println("YES"); // 스택이 비어 있을 경우
            else System.out.println("NO"); // 스택에 원소가 남아 있는 경우

            stack.clear(); // 스택 초기화
        }

        sc.close();
    }
}
