import java.util.Scanner;
public class lab205 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();

    }
    static void test(){
        System.out.println("Enter an integer:");
        int a = keyboard.nextInt();

        if((a%6)==0)
                   System.out.printf("%d是2'3'6的倍數\n",a);
        else if((a%2)==0)
                   System.out.printf("%d是2的倍數\n",a);
        else if((a%3)==0)
                   System.out.printf("%d是3的倍數\n",a);
        else
                   System.out.printf("%d不是2'3'6的倍數\n",a);

    }
}