import java.util.Scanner;

public class problem2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    public static int gcd(int a, int b){
        int temp;
        while(b!=0) {
            temp = a%b;
            a = b;
            b = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }


}
