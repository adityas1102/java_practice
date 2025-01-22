import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your department (Engineering/Science): ");
        String department = scanner.next();

        System.out.print("Enter your year (1-4): ");
        int year = scanner.nextInt();

        switch (department) {
            case "Engineering":
                System.out.println("Department: Engineering");
                switch (year) {
                    case 1:
                        System.out.println("First Year Engineering Subjects");
                        break;
                    case 2:
                        System.out.println("Second Year Engineering Subjects");
                        break;
                    case 3:
                        System.out.println("Third Year Engineering Subjects");
                        break;
                    case 4:
                        System.out.println("Fourth Year Engineering Subjects");
                        break;
                    default:
                        System.out.println("Invalid year");
                }
                break;

            case "Science":
                System.out.println("Department: Science");
                switch (year) {
                    case 1:
                        System.out.println("First Year Science Subjects");
                        break;
                    case 2:
                        System.out.println("Second Year Science Subjects");
                        break;
                    default:
                        System.out.println("Invalid year");
                }
                break;

            default:
                System.out.println("Invalid department");
        }

        scanner.close();
    }
}
