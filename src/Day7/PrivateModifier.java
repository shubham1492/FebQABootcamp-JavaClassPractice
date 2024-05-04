package Day7;

public class PrivateModifier {

    private int data = 40;

    private void msg(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        PrivateModifier privateModifier = new PrivateModifier();
        System.out.println(privateModifier.data);
        privateModifier.msg();
    }

}
