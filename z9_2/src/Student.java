import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<Student>{
    public int id;
    public String name;
    public double averageGrade;

    public Student(int id, double averageGrade) {
        this.id = id;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.averageGrade, student1.averageGrade);
    }
}

class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {

        return Integer.compare(student1.id, student2.id);
    }
}