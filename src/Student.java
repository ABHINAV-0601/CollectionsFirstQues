import java.util.Objects;

public class Student {
    private String name;
    private int rollNo;
    private double cpi;

    public Student(String name, int rollNo, double cpi) {
        this.name = name;
        this.rollNo = rollNo;
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + cpi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Double.compare(student.cpi, cpi) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, cpi);
    }
}
