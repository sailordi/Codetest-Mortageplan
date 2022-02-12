import java.io.*;
import java.util.ArrayList;

/*! The class handles reading/writing data */
public class DataHandler {
    public DataHandler() {

    }

  public ArrayList<Customer> readFile(String file,int skip) {
        ArrayList<Customer> ret = new ArrayList<>();
        File f = new File(file);

            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                int i = 0;

                while((line = br.readLine() ) != null) {
                    if(i < skip) {
                        i++;
                        continue;
                    }
                    i++;
                    if(line.isEmpty() == true) {
                        continue;
                    }
                    Customer c = this.parseStringToCustomer(line);

                    if(c != null) {
                        ret.add(c);
                    }

                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                return ret;
            }catch(IOException ex) {
                ex.printStackTrace();
                return ret;
            }

            return  ret;
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
