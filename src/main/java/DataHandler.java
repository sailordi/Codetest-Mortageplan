/*! The class handles reading/writing data */
public class DataHandler {
    public DataHandler() {

    }

    public Customer parseStringToCustomer(String str) {
        String[] l = str.split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*[1-9])");

        if(l.length != 4){
            return null;
        }

        int pos = l.length-1;

        int y = Integer.parseInt(l[pos--]);
        double i = Double.parseDouble(l[pos--]);
        double t = Double.parseDouble(l[pos--]);
        String n = l[pos--].replace("\"","");

        return new Customer(n,t,i,y);
    }

}
