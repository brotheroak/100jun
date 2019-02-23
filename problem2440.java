import java.util.*;

public class problem2440 {

    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        StringBuffer str;

        for(int i = a; i > 0; i--)
        {
            str = new StringBuffer();
            for(int j =0; j < i; j++)
                str.append("*");
            System.out.println(str.toString());
        }
    }
}
