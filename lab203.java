import java.util.Scanner;
public class lab203 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        


        
    }
    static void test(){
        System.out.println("Input an integer");
        int a = keyboard.nextInt();
        
        if((a%2)==0)
                    System.out.printf("The number is even.\n");
        else if((a%2)==1)
                    System.out.printf("The number is odd.\n");
        else
                    System.out.printf("Error!!");
        
    }
}