import java.util.ArrayList;
import java.util.Scanner;

public class Setter {
    private double grade;
    private double average;

    public Setter(double grade, double average) {
        this.grade = grade;
        this.average = average;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public static boolean isOptionValid(String input) {
        String[] validOptions = {"enter-grade", "quit", "done"};
        for (String option : validOptions) {
            if (option.equals(input))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Setter result = new Setter(0, 0);
        Scanner input = new Scanner(System.in);
        String option;
        ArrayList<Double> grades = new ArrayList<>();

        do {
            System.out.println("Options: enter-grade, quit, done");
            option = input.nextLine().trim().toLowerCase();
            while (!isOptionValid(option)) {
                System.out.println("Invalid input");
                System.out.println("Options: enter-grade, quit, done");
                option = input.nextLine().trim().toLowerCase();
            }
            if (option.equals("enter-grade")) {
                System.out.print("Enter grade: ");
                while (!input.hasNextDouble()) {
                    System.out.println("Invalid input, please enter a number.");
                    input.next();
                }
                double grade = input.nextDouble();
                input.nextLine();  // Consume newline character
                result.setGrade(grade);
                grades.add(result.grade);
                System.out.println("Grades:");
                for (int i = 0; i < grades.size(); i++) {
                    System.out.println(grades.get(i));
                }
            } else if (option.equals("quit")) {
                System.exit(0);
            } else if (option.equals("done")) {
                double sum = 0;
                for (double grade : grades) {
                    sum += grade;
                }
                result.setAverage(sum / grades.size());
                System.out.println("Average grade: " + result.average);
                System.exit(0);
            }
        } while (!option.equals("quit"));
    }
}
