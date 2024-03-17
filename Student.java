import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting student's name
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        // Getting student's date of birth
        System.out.print("Enter student's date of birth (YYYY-MM-DD): ");
        String dobString = scanner.next();

        // Converting date of birth string to Date object
        Date dob = parseDate(dobString);

        // Displaying student's information if date parsing was successful
        if (dob != null) {
            displayStudentInfo(name, dob);
        } else {
            System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format.");
        }

        scanner.close();
    }

    // Function to parse date string to Date object
    public static Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            return null; // Return null if parsing fails
        }
    }

    // Function to calculate and display student's age
    public static void displayStudentInfo(String name, Date dob) {
        // Calculating current date
        Date currentDate = new Date();

        // Calculating student's age
        long ageInMillis = currentDate.getTime() - dob.getTime();
        long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);

        // Displaying student's name and age
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + ageInYears + " years");
    }
}
