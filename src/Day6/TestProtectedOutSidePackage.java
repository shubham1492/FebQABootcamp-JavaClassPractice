package Day6;

import Day7.ProtectedModifier;

public class TestProtectedOutSidePackage extends ProtectedModifier {
    public static void main(String[] args) {
        TestProtectedOutSidePackage testProtectedOutSidePackage = new TestProtectedOutSidePackage();
        System.out.println(testProtectedOutSidePackage.age);
        testProtectedOutSidePackage.msg();
    }
}
