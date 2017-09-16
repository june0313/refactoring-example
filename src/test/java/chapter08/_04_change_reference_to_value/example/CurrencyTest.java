package chapter08._04_change_reference_to_value.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CurrencyTest {

    @Test
    public void testEquals() throws Exception {
        final Currency usdCurrency1 = new Currency("USD");
        final Currency usdCurrency2 = new Currency("USD");

        assertTrue(usdCurrency1.equals(usdCurrency2));
        assertEquals(usdCurrency1, usdCurrency2);
    }

}