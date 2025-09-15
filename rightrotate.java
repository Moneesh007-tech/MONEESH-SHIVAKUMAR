import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int leftr = input.nextInt();
        for (int j = 1; j <= leftr; j++) {
            int temp=arr[0];
            for (int i = 1; i < size; i++) {
                arr[i]=arr[i+1];
                arr[size-1]=temp;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
