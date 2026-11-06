import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int start1 = a - 1;
        int end1 = b - 1;
        while (start1 < end1) {
            int temp = arr[start1];
            arr[start1] = arr[end1];
            arr[end1] = temp;
            start1++;
            end1--;
        }

        int start2 = c - 1;
        int end2 = d - 1;
        while (start2 < end2) {
            int temp = arr[start2];
            arr[start2] = arr[end2];
            arr[end2] = temp;
            start2++;
            end2--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

