import java.util.*;

public class problem2439 {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        StringBuffer str;

        for(int i = 1; i <= a; i++)
        {
            str = new StringBuffer();
            for(int j=0; j < a-i; j++)
                str.append(" ");
            for(int k=0; k < i; k++)
                str.append("*");
            System.out.println(str.toString());
        }
    }
}
