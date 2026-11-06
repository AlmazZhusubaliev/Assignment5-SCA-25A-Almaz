import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
