/*! The class handles anny mortage functionality */
public class MortageHandler {
    public double exp(double num,int exponent){
        double ret = 1;

            if(exponent != 0) {
                int t = exponent > 0 ? exponent : (-1)*exponent;

                for(int i = 1; i <= t; i++) {
                    ret *= num;
                }
            }
            return ret;
    }

    public double calculateFixedMonthlyPayment(double totalLoan,double intrest,int years) {
        int time = 12*years;
        double rate = (intrest/100.0)/12.0;

        return totalLoan*((rate*this.exp(1+rate,time))/(this.exp(1+rate,time)-1) );
    }

}
