import java.util.*;
public class lab208 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        test();

        
    }
    static void test(){
        System.out.println("Input:");
        int a = keyboard.nextInt();

        if(a>=90)
                System.out.println("Your grade is A");
        else if(a>=80)
                System.out.println("Your grade is B");
        else if(a>=70)
                System.out.println("Your grade is C");
        else if(a>=60)
                System.out.println("Your grade is D");
        else
            System.out.println("Your grade is F");
    }

}