import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentNames {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Ajay");
        students.add("Rajesh");
        students.add("Arun");
        students.add("Suresh");
        students.add("Aliya");
        students.add("John");
        students.add("Aruna");
        students.add("Vikram");
        students.add("Alex");
        students.add("Rahul");

        List<String> specialStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students eligible for special gifts: " + specialStudents);
    }
}
