import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  a, arm=0, count=0; 
		int n = sc.nextInt();
		int temp=n, temp2 =n, val;
		while(n>0) {
			count++;
			n /=10;
		}
		while(temp>0) {
			a =  temp%10;
			val =1;
			for(int i =0; i<count; i++) {
				val *= a;
			}
			arm += val;
			temp /= 10;
		}
		if(arm == temp2) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
		sc.close();
	}
}
