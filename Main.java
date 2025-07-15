import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Print All Students");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    manager.addStudent(id, name);
                    System.out.println("Student added.");
                    break;
                case "2":
                    System.out.print("Enter student ID: ");
                    String gradeId = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade;
                    try {
                        grade = Integer.parseInt(scanner.nextLine());
                        manager.addGrade(gradeId, grade);
                        System.out.println("Grade added.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid grade input.");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3":
                    manager.printAllStudents();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
