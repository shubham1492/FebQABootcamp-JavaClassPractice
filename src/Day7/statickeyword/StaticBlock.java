package Day7.statickeyword;

public class StaticBlock {

    static int data ;

   static {
       data = 40;
       System.out.println("Static block is invocked");
   }

    public static void main(String[] args) {

        System.out.println("Main method");
        System.out.println(StaticBlock.data);
    }
}
