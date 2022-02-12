import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*! Tests parsing customer string data into a customer */
public class ParseStringToCustomerTest {
    @Test
    void test() {
        String s1 = "\"Clarencé,Andersson\",2000,6,4";
        String s2 = "Claes Månsson,1300.55,8.67,2";
        DataHandler dH = new DataHandler();

        Customer c1 = dH.parseStringToCustomer(s1);
        Customer c2 = dH.parseStringToCustomer(s2);

        assertEquals(4,c1.years() );
        assertEquals(6,c1.interest() );
        assertEquals(2000,c1.total() );
        assertEquals("Clarencé,Andersson",c1.name() );

        assertEquals(2,c2.years() );
        assertEquals(8.67,c2.interest() );
        assertEquals(1300.55,c2.total() );
        assertEquals("Claes Månsson",c2.name() );
    }
}
