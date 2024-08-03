import java.util.Scanner;

public class ci {
    public static void main(String[] args){
        int p,r,t;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the principal");
        p=sc.nextInt();

        System.out.println("Enter the year:");
        r=sc.nextInt();

        System.out.println("Enter the rate");
        t=sc.nextInt();

        double ci;

        ci = p * (Math.pow((1+r/100),t));

        System.out.println("The compound Interest:"+ci);
    }
}
