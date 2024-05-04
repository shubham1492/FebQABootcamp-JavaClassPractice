package Day7;

public class InstanceBlock {


    {
        System.out.println("Instance Block");
    }

    InstanceBlock(){
        System.out.println("In constructor");
    }

    public static void main(String[] args) {
       InstanceBlock b1 = new InstanceBlock();
    }
}
