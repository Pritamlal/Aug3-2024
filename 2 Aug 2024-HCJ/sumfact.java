import java.util.Scanner;

public class sumfact{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number::");
        int terms = sc.nextInt();

        int first=0,second=1;

        System.out.println("Fibonacci Series"+terms+"terms:");

        for(int i=0;i< terms;i++){
            System.out.println(first+" ");

            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}