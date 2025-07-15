import java.util.ArrayList;
import java.util.List;
public class Student{
    private String id;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getAverage(){
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int i=0; i < grades.size(); i++) {
            sum = grades.get(i);
        }
        return (double) sum/grades.size();
        
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}