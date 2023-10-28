import java.util.Scanner;

public class CountingOcurrences {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.print("Add the large number: ");
        int number=scan.nextInt();
        System.out.print("Add the number you want to count: ");
        int numberToCount=scan.nextInt();

        int count=0;
        while (number>0) {
            int reminder=number%10;
            if(reminder==numberToCount) count++;
            number=number/10;
        }
        System.out.println(count);
        scan.close();
    }
}
