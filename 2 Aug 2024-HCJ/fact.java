import java.util.Scanner;

public class fact{
    public static void main(String[] args){
        int num,multi=1;
        

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number::");
        num = s.nextInt();
        
       
        while(num>0){
            multi=multi*(num);
            num--;
        }
        System.out.println("The fact is:" +multi);
        s.close();
    }
}