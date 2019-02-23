import java.util.Scanner;
import java.util.Stack;

public class problem9012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean e;
        int a = scan.nextInt();

        for(int i = 0; i < a ; i++)
        {
            e = true;
            String b  = scan.next();
            char[] c = b.toCharArray();
            Stack s = new Stack();
            for(char d : c)
            {
                if(d =='(') {
                    s.push("1");
                }
                else if (d ==')'){
                    if (s.empty()){
                        e = false;
                        break;
                    } else {
                        s.pop();
                    }
                }
            }
            if(s.empty() & e == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
