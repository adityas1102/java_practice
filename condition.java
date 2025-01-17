
import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        
        //if else if Ladder
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a == b){
        //     System.out.println("Equal");
        // }else if(a>b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.println("a is lesser");
        // }


        //ODD and EVEN Number
        // if(x%2==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }


        // Switch Statements

        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }

    }
}
