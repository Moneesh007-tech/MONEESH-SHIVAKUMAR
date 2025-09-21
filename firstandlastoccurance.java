import java.util.Scanner;
public class FirstAndLastOccurrenceOfADigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), num = sc.nextInt();
		int count=0, temp=n, first=0, last=0;
		while(n>0) {
			count++;
			n /= 10;
		}
		int arr[] = new int[count];
		String name = Integer.toString(temp);
		for(int i=0; i<count; i++) {
			arr[i] = name.charAt(i);
		}
		for (int k =0; k<count; k++) {
			if(num == arr[k] - '0') {
				first = k+1;
				break;	
			}
		}
		for(int j=count-1; j >=0; j--) {
			if(num == arr[j] - '0') {
				last = j+1;
				break;
			}
		}
		System.out.println("First="+ first+", Last="+last);
		sc.close();
	}
}
