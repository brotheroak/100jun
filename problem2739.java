
import java.util.*;

public class problem2739 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        for(int i = 0 ; i < 9; i++)
        {
            System.out.printf("%d * %d = %d\n", a, i+1, a * (i+1));
        }
    }
}