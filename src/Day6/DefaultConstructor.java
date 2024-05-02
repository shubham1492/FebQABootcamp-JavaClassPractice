package Day6;

public class DefaultConstructor {

//    DefaultConstructor(){
//        System.out.println("inside default constructor");
//    }

    int val;
    String name;

    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        System.out.println(defaultConstructor.val);
        System.out.println(defaultConstructor.name);
    }

}
