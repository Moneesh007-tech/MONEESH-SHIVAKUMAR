import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int ind = sc.nextInt();
        for (int i = ind; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
