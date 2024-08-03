import java.util.Scanner;

public class si {
    public static void main(String[] args){
        int p,n,r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the prinicpal:");
        p = sc.nextInt();
        System.out.println("Enter the year:");
        n = sc.nextInt();
        System.out.println("Enter the rate:");
        r = sc.nextInt();

        int si = (p * n * r)/1000;

        System.out.println("The simple interest is:" +si);
    }
}
