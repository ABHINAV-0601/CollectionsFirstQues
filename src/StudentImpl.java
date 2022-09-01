import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentImpl {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl();
        Set<Student> studentSet = student.createSet();
        student.display(studentSet);

        boolean result = student.removeByName(studentSet);

        System.out.println(result);

        student.display(studentSet);
    }

    public Set<Student> createSet(){
        Set<Student> students = new HashSet<>();
        students.add(new Student("Abhinav",1,85));
        students.add(new Student("Vaibhav",12,100));
        students.add(new Student("Jayant",15,89));
        students.add(new Student("Sanam",45,75));
        students.add(new Student("Vaibhav",12,100));
        return students;
    }

    public void display(Set<Student> students){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public boolean removeByName(Set<Student> students){
        boolean flag = false;
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student reference = iterator.next();
            char firstChar = reference.getName().charAt(0);
            if(firstChar == 'A' || firstChar == 'J'){
                iterator.remove();
                flag = true;
            }
        }
        return flag;
    }
}
