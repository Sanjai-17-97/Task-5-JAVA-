import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthdate = LocalDate.parse(birthdateInput, formatter);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthdate, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days.");
        
        scanner.close();
    }
}
