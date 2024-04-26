package Day4;

public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student(123,"harish");

        System.out.println(student.rollNumber);
        System.out.println(student.name);

        Student student1 = new Student(1234,"Mahesh");

        System.out.println(student1.rollNumber);
        System.out.println(student1.name);
    }
}
