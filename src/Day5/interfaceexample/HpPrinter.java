package Day5.interfaceexample;

public class HpPrinter implements Printable {

    public void print(){
        System.out.println("Hp printer print");
    }

    public static void main(String[] args) {

        HpPrinter hpPrinter = new HpPrinter();
        hpPrinter.print();
    }
}
