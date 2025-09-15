import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=input.nextInt();
        int arr[]=new int[size+1];
        for(int i=1;i<=size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int pos=input.nextInt();
        int ele=input.nextInt();
        for(int i=size-1;i>=pos-1;i--){
            arr[i+1]=arr[i];
            arr[pos-1]=ele;

        }
        System.out.println(Arrays.toString(arr));
    }
}
