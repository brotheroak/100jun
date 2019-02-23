import java.util.*;

public class problem2438 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a;
        StringBuffer str = new StringBuffer();

        a = sc.nextInt();

        for(int i = 0; i < a; i++)
        {
            str.append("*");
            System.out.println(str.toString());
        }
    }
}
