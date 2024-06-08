import java.util.Scanner;
public class lab202 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        
    }
    public static void test() {
        System.out.println("Input:"); 
            int a,b;
            a=keyboard.nextInt();
            b=keyboard.nextInt();

            if(a>b)
                   System.out.printf("%d is large than %d\n",a,b);
            
            else if(b>a)
                   System.out.printf("%d is large than %d\n",b,a);
            
            else
                   System.out.printf("%d is equal to %d\n",a,b);
            
            
        }

        
            


    }
       

    