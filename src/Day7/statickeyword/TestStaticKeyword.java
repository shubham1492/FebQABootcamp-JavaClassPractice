package Day7.statickeyword;

public class TestStaticKeyword {
    public static void main(String[] args) {

        Student.change();
        Student s1 = new Student(1223,"harish");
        Student s2 = new Student(1224,"mahesh");

        s1.display();
        s2.display();
    }
}
