import java.util.*;

public class problem11720 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a, sum;
            String b;

            a = sc.nextInt();
            b = sc.next();
            sum = 0;

            for(int i = 0; i < a; i++)
                sum += Character.getNumericValue(b.charAt(i));

            System.out.println(sum);
        }
}
