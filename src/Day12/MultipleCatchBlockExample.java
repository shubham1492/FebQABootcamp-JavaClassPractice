package Day12;

public class MultipleCatchBlockExample {

    public static void main(String[] args) {

        try{
            String s1 = "abc";
            int i = Integer.parseInt(s1);
            System.out.println(i);
            int a[] = new int[5];
            a[5] = 30/5;
            String s = null;
            System.out.println(s.length());
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }catch(Exception e){
            System.out.println("parent exception occur");
        }

        System.out.println("Rest of the code");



    }
}
