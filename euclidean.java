import java.util.Scanner;
public class GCD_EuclideanAlgorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		int dividend = (n1 > n2) ? n1 : n2;
		int divisor = (n1 < n2) ? n1 : n2;
		int rem = dividend % divisor;
		if( rem == 0)System.out.println(divisor);
		else {
			dividend = divisor;
			divisor = rem;
			rem = dividend % divisor;
		}
		System.out.println(divisor);
		sc.close();
	}
}
