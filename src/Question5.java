import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the value of r: "); 
        float r = sc.nextFloat();// Accept input
        sc.close();

        double s = 2*r* Math.sin(Math.toDegrees(Math.PI/5)); // Compute r
        double area = (5 * Math.pow(s,2))/(4*Math.tan(Math.toDegrees(Math.PI/5))); // Compute area
        System.out.printf("Area is %.2f square units", area); // Display output
    }
}
