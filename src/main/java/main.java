import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        DataHandler dH =  new DataHandler();
        MortageHandler mH = new MortageHandler();
        ArrayList<Customer> customers = dH.readFile("prospects.txt",1);

        for(int i = 0; i < customers.size(); i++) {
            Customer c = customers.get(i);
            String n = c.name();
            double total = c.total();
            double intrest = c.interest();
            int years = c.years();
            double monthlyPayments = mH.calculateFixedMonthlyPayment(total,intrest,years);

            System.out.printf("Prospect %d: %s wants to borrow %.2f € for a period of %d years and pay %.2f € each month\n",
                    i+1,n,total,years,monthlyPayments);
        }
        System.out.printf("\n\nPress any key to continue\n");

        try {
            System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
