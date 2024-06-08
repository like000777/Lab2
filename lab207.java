import java.util.*;
public class lab207 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
        test();
        test();
        
    }
    static void test(){
        System.out.println("請輸入三個整數:");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int x[]= {a,b,c};
        Arrays.sort(x);
        a=x[0];
        b=x[1];
        c=x[2];
        if((a+b<=c) ||a<=0||b<=0||c<=0){
            System.out.println("不可以構成三角形"); 
        }
                
        else if(a*a+b*b==c*c){
            System.out.println("直角三角形");
        }
        else if(a*a+b*b<c*c){
            System.out.println("鈍角三角形");
        }
        else{
            System.out.println("銳角三角形");
        }
                   

          
         
                
        
                      
             
 
    }
}