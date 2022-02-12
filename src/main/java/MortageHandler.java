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

}
