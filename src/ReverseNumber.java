import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Add the number you want to reverse: ");
        int number=scan.nextInt();
        int reverse=0;
        while (number>0) {
            int reminder=number%10;
            number=number/10;
            reverse=reverse*10+reminder;
        }
        System.out.println(reverse);
        scan.close();
    }
    
}
