import java.util.Scanner;
import java.util.Stack;

public class problem1406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        String a = sc.next();

        char[] b= a.toCharArray();
        for(int i = 0; i < b.length ; i++){
            left.push(b[i]);
        }
        int d = sc.nextInt();
        for(int i =0; i < d ; i++) {
            if (sc.next().equals('L')){
                if (!left.empty()) {
                    right.push(left.peek());
                    left.pop();
                }
            } else if (sc.next().equals('D')) {
                if (!right.empty()) {
                    left.push((right.peek()));
                    right.pop();
                }
            } else if (sc.next().equals('B')) {
                if(!left.empty()) {
                    left.pop();
                }
            } else if (sc.next().equals('P')){
                String e = sc.next();
                left.push(e.charAt(0));
            }
        }
        while (!left.empty()) {
            right.push(left.peek());
            left.pop();
            //right.push(left.pop());
        }
        while(!right.empty()) {
            System.out.print(right.peek());
            right.pop();
        }
    }
}
