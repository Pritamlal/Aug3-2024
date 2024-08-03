import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args) {
        int num, i, j, k;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num - i; j++) {
                System.out.print(" "); 
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
