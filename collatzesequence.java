import java.util.Scanner;
public class CollatzSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), temp;
		while(n > 0) {
			if(n % 2==0) {
				System.out.print(n+" ");
				 n /= 2;
			}
			else {
				System.out.print(n+" ");
				if(n != 1) {
					temp = ((n*3)+1);
					n = temp;
				} else break;
			}
		}
		sc.close();
	}
}
