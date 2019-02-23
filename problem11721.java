import java.util.*;

public class problem11721 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a;
        StringBuffer str = new StringBuffer();

        a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            str.append(a.charAt(i));

            if (str.length() % 10 == 0 | i == a.length()-1) {
                System.out.println(str.toString());
                str = new StringBuffer();
            }
        }
    }
}



