import java.util.*;

public class problem10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int tmp;
        int max;
        int min;

        a = sc.nextInt();

        tmp = sc.nextInt();
        max = tmp;
        min = tmp;

        for (int i = 0; i < a-1 ; i++)
        {
            tmp = sc.nextInt();
            if (tmp > max) max = tmp;
            else if (tmp < min) min = tmp;
        }

        System.out.printf("%d %d",min, max);
    }
}
