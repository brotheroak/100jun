import java.util.*;

public class problem2441 {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

                StringBuffer str;

                for(int i = 0; i < a; i++)
        {
        str = new StringBuffer();

        for(int j = 0; j < i; j++ )
        str.append(" ");
        for(int k = a-i; k > 0; k--)
        str.append("*");

        System.out.println(str.toString());
        }
    }
}
