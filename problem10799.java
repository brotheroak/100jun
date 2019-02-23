import java.util.Scanner;
import java.util.Stack;

public class problem10799 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        char[] b = a.toCharArray();
        Stack<Integer> c = new Stack();
        int ans = 0;

        for(int i = 0; i < b.length; i++){
            if(b[i] == '(') c.push(i);
            else
            {
                if(c.peek() +1 == i) {
                    c.pop();
                    ans += c.size();
                } else {
                    c.pop();
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
