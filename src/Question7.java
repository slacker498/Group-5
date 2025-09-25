import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        String course;
        int year;
        String major = "";
        String x = "";
        System.out.println("enter your course: M,C ,or I");
        Scanner input = new Scanner(System.in);
        course = input.nextLine();
        System.out.println("enter your year: 1,2,3,4");
        year = input.nextInt();
        switch (course) {
            case "M":
                major = "Mathematics";
                break;
            case "C":
                major = "Computer Science";
                break;
            case "I":
                major = "Information Technology";


        }
        switch (year) {
            case 1:
                x = "Freshman";
                break;
            case 2:
                x = "Sophomore";
                break;
            case 3:
                x = "Junior";
                break;
            case 4:
                x = "Senior";
                break;
    }
    System.out.println("You are a " + major + x);
}
}
