import java.util.Scanner;

public class main
{
    public static void  main(String[] args)
    {
        Scanner kbd=new Scanner(System.in);
        int year=kbd.nextInt();
        if(year%400==0 || year%4==0){
            System.out.println("Leap Year.");
        }
        else{
            System.out.println("Not Leap Year.");
        }

    }
}
