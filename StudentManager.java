import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(String id, String name) {
        if (students.containsKey(id)) {
            System.out.println("Student with ID " + id + " already exists.");
            return;
        }
        students.put(id, new Student(id, name));
    }

    public void addGrade(String id, int grade) {
        Student student = students.get(id);
        if (student == null) {
            throw new IllegalArgumentException("Student not found");
        }
        student.addGrade(grade);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student s : students.values()) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Average Grade: " + s.getAverage());
        }
    }

    public boolean studentExists(String id) {
        return students.containsKey(id);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }
} 