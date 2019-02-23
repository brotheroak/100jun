import java.util.*;

public class problem1924 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31 ,30 ,31,30, 31};
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        int sm = a - 1;
        int sd = b - 1;
        for (int i = 0; i < sm; i++) {
            sd += days[i];
        }
        sd %= 7;

        System.out.print(day[sd]);
    }
}
