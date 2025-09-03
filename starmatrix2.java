import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1; col<=n-row; col++) {
                System.out.print(" ");
            }
                for(int col=1; col<=2*row-1; col++) {
                    System.out.print("*");
                }    System.out.println();

            }
            for(int row=n-1; row>=1; row--){
                for(int col=1; col<=n-row;col++) {
                    System.out.print(" ");
                }
                    for (int col=1; col<=2*row-1; col++) {
                        System.out.print("*");
                    }   System.out.println();

                }
            }

        }
