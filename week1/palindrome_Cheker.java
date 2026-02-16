import java.util.*;
public class palindrome_Cheker {
    public static void main (String args[]){
        System.out.println("Welcome to the app\n"+"Version 1.0 \n"+"System initialized successfully");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the palindrome\n");
        int inp = sc.nextInt();
        int num = 0;
        int c = inp;
        while(inp!=0){
            
            int remainder = inp%10;
            num = num*10 + remainder;
            inp = inp/10;
            
        }
       
        if (num == c){
            System.out.println("The number is a palindrome");
            
        }
        else{
            System.out.println("The number is not a palindrome");
        }

    }

    
}