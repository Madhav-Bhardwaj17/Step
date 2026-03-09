import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        

        
        String str = "madam";
        String new_str="";

        for(int i = str.length()-1 ; i>=0;i--){
            new_str = new_str + str.charAt(i);
           
            
        }

        if(str.equals(new_str)){
            System.out.println("The given string is the plindrome");
        }
        else{
            System.out.println("The given string is not a plaindrome ");
        }
        
      
    }
}