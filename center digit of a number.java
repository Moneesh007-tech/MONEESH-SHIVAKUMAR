import java.util.Scanner;
public class CenterDigitOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), temp=n, count=0, digit=0;
		while(n>0) {
			count ++;
			n /= 10;			
		}
		if(count %2 ==0) {
			System.out.println("-1");
		}
		else {
			count /= 2;
			for(int i=0; i<=count; i++) {
				digit = temp %10;
				temp /= 10;
			}
			System.out.println(digit);
		}
		sc.close();
	}
}
