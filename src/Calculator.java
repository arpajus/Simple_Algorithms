import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        boolean program=true;

        while (program) {
            int number1=0;
            int number2=0;
            float answer=0;

            System.out.println("Take the operation you want: \n [1] Add \n [2] Substract \n [3] Multiply \n [4] Divide \n [0] Exit");
            int option=scan.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("Enter the two numbers you want to add: ");
                    number1=scan.nextInt();
                    number2=scan.nextInt();
                    answer=add(number1,number2);
                    break;
                case 2:
                    System.out.println("Enter the two numbers you want to substract: ");
                    number1=scan.nextInt();
                    number2=scan.nextInt();
                    answer=substract(number1,number2);
                    break;
                case 3: 
                    System.out.println("Enter the two numbers you want to multiply: ");
                    number1=scan.nextInt();
                    number2=scan.nextInt();
                    answer=multiply(number1,number2);
                    break;
                case 4: 
                    System.out.println("Enter the two numbers you want to divide: ");
                    number1=scan.nextInt();
                    number2=scan.nextInt();
                    if(number2!=0) answer=divide(number1,number2);
                    else System.out.println("You cant divide by 0");
                    break;
                case 0:
                    program=false;
                default:
                    System.out.println("Invalid number");
            }
            System.out.println(answer);
        }
        scan.close();
    }
    private static float divide(int number1, int number2) {
        return (float)number1/(float)number2;
    }
    private static int multiply(int number1, int number2) {
        return number1*number2;
    }
    public static int substract(int number1, int number2) {
        return number1-number2;

    }
    public static int add(int number1, int number2){
        return number1+number2;
    }

    
}
