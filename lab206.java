import java.util.Scanner;
public class lab206 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        
    }
    static void test(){
        System.out.println("Input Chinese score:");
        int chi = keyboard.nextInt();
        System.out.println("Input English score:");
        int eng = keyboard.nextInt();
        System.out.println("Input Math score:");
        int math = keyboard.nextInt();

        if(chi<60)
                 System.out.printf("Chinese failed.\n");
        if(eng<60)
                 System.out.printf("English failed.\n");
        if(math<60)
                 System.out.printf("Math failed.\n");
        if(chi>60 && eng>60 && math>60)
                                      System.out.printf("All pass.\n");

    }
}