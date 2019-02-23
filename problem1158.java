import java.util.*;

public class problem1158 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        System.out.print("<");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                q.offer(q.peek());
                q.poll();
            }
            System.out.print(q.peek() + ", ");
            q.poll();
        }
        System.out.print(q.peek() + ">");
    }
}
