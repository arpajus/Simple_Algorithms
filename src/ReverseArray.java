import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Determine the size of the array: ");
        int size=scan.nextInt();
        int[] list=new int[size];
        System.out.println("Add "+size+" numbers on the list");
        for(int i=0; i<list.length;i++){
            list[i]=scan.nextInt();
        }
        System.out.println("This is your actual array");
        System.out.println(Arrays.toString(list));

        reverse(list);

        System.out.println("This is your array after reverse it");
        System.out.println(Arrays.toString(list));
        scan.close();

    }

    public static void reverse(int[] list) {
        int start=0;
        int end=list.length-1;

        while (start<end) {
            swap(list, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] list, int start, int end) {
        int temp=list[start];
        list[start]=list[end];
        list[end]=temp;
    }
    
}
