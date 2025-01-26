import java.util.Scanner;
public class ASCII{ 
    public static void main(String[] args) {
        
    
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a character:");
        char character=scanner.next().charAt(0);
        int asciiValue=(int)character;
        System.out.println("the ASCII value of" + character + "is:" + asciiValue);
        scanner.close();
    }
}


    

