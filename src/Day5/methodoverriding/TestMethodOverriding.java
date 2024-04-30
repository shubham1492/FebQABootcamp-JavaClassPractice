package Day5.methodoverriding;

import java.util.SortedMap;

public class TestMethodOverriding {

    public static void main(String[] args) {

        Bank sbi = new Sbi();
        Bank axis = new Axis();
        Bank hdfc = new HDFC();

        System.out.println("SBI rate of interest : " + sbi.getRateOfInterest());
        System.out.println("Axis rate of interest : " + axis.getRateOfInterest());
        System.out.println("HDFC rate of interest : " + hdfc.getRateOfInterest());


    }
}
