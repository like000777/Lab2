import java.util.Scanner;
public class lab04 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();

    }
    static void test(){
        System.out.println("Input:");
        int a = keyboard.nextInt();

        if((a%5)==0 && (a%9)==0)
                    System.out.printf("Yes\n");
        else
            System.out.printf("NO\n");

    }
}