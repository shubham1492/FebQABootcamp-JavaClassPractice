package Day5.abstractclass;

public class TestBank {
    public static void main(String[] args) {

        SBI sbi = new SBI();
        PNB pnb = new PNB();

        System.out.println("Rate of interest is :"+ sbi.getRateofInterest());
        System.out.println("Rate of interest is :"+ pnb.getRateofInterest());
    }
}
