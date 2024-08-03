import java.util.Scanner;

public class rectangle {
    public static void main(String [] args){
        int l,b,peri;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        l = sc.nextInt();

        System.out.println("Enter the breadth");
        b = sc.nextInt();

         peri = 2*(l+b);

         System.out.println("THe perimeter is : "+peri);

    }
}
