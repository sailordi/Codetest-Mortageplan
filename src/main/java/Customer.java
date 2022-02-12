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

    public void setName(String d) {
        this.name = d;
    }

    public void setTotal(double d) {
        this.total = d;
    }

    public void setInterest(double d) {
        this.interest = d;
    }

    public void setYears(int d) {
        this.years = d;
    }

    public String name() {
        return this.name;
    }

    public double total() {
        return this.total;
    }

    public double interest() {
        return this.interest;
    }

    public int years() {
        return this.years;
    }

}
