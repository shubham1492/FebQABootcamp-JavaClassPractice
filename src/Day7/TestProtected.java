package Day7;

public class TestProtected extends ProtectedModifier{
    public static void main(String[] args) {

        TestProtected testProtected = new TestProtected();
        System.out.println(testProtected.age);
        testProtected.msg();
    }
}
