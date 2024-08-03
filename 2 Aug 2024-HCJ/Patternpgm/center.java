import java.util.Scanner;

public class center {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            // Print leading spaces
            for (int j = num; j > i; j--) {
                System.out.print("   "); // Three spaces for alignment
            }

            // Print increasing part of the pattern
            int value = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + "  "); // Two spaces after the number
                value++;
            }

            // Print decreasing part of the pattern
            value -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(value + "  ");
                value--;
            }

            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}

