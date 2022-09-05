import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"Abhishek","Manager"));
        employeeList.add(new Employee(102,"Diwakar","Software Engineer"));
        employeeList.add(new Employee(103,"Aamir","HR"));
        employeeList.add(new Employee(104,"Shyambhavi","Teachnical Head"));
        employeeList.add(new Employee(105,"Abdul","Store Incharge"));

        for (Employee element : employeeList){
            System.out.println(element);
        }
        System.out.println();
        Set<Employee> employeeSet = new TreeSet<>();

        Iterator<Employee> iterator = employeeList.iterator();
        while(iterator.hasNext()){
            employeeSet.add(iterator.next());
        }

        for (Employee element : employeeSet){
            System.out.println(element);
        }
        System.out.println();
        Set<Employee> employees = new TreeSet<>();
        employees.addAll(employeeList);

        for (Employee element : employees){
            System.out.println(element);
        }
    }
}
