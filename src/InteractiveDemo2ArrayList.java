import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteractiveDemo2ArrayList {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student s1 = new Student("Abhinav",1,95);
        Student s2 = new Student("Vaibhav",12,100);
        Student s3 = new Student("Ramesh",18,85);
        Student s4 = new Student("Bhavesh",25,65);
        Student s5 = new Student("Harish",26,99);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        Iterator<Student> iterator = studentList.iterator();
        double totalMarks = 0.0;
        while(iterator.hasNext()){
            Student element = iterator.next();
            totalMarks += element.getMarks();
            if(element.getName().charAt(0) == 'B'){
                iterator.remove();
            }
            if (element.getName().charAt(0) == 'H'){
                System.out.println(element);
            }
        }
        System.out.println("Average = "+ totalMarks/studentList.size());
    }
}
