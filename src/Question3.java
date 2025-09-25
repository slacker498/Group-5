import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter you want to convert:");
        String letter = sc.next();

        switch (letter.toLowerCase()) {
            case "a", "b","c": 
            System.out.println("your number is 2"); break;
            
            case "d", "e","f": 
            System.out.println("your number is 3"); break;
            case "g", "h","i": 
            System.out.println("your number is 4"); break;
            case "j", "k","l": 
            System.out.println("your number is 5"); break;
            case "m", "n","o": 
            System.out.println("your number is 6"); break;
            case "r", "q","p","s": 
            System.out.println("your number is 7"); break;
            case "v", "t","u": 
            System.out.println("your number is 8"); break;
            case "z", "w","x","y": 
            System.out.println("your number is 9"); break;
            
            default:
            System.out.println("Enter a valid letter!"); 
                break;
        }

    }
}
