/*! The class contains customer data */
public class Customer {
    private String name = "";
    private double total = 0.0;
    private double interest = 0.0;
    private int years = 0;

    public Customer() {
    }

    public Customer(String name,double total,double interest,int years) {
        this.name = name;
        this.total = total;
        this.interest = interest;
        this.years = years;
    }

}
