import java.util.Scanner;
public class JPA01 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter score");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        test(a);
        int b = sc.nextInt();
        test(b);
        sc.close();

        
    }
    public static void test(int c) {
        if(c>=60)
        System.out.println("You pass");
        System.out.println("End");
        
  }     
}
