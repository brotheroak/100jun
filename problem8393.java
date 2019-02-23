import java.util.*;

public class problem8393 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, sum;
        a = sc.nextInt();
        sum = 0;

        for(int i = 1; i <= a; i++ ){
            sum += i;
        }

        System.out.println(sum);
    }
}
