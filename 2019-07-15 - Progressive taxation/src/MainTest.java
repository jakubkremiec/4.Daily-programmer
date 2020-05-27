import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void check_tax_to_pay() {
        Main main = new Main();

        assertEquals(main.taxCalculate(0), 0);
        assertEquals(main.taxCalculate(10000), 0);
        assertEquals(main.taxCalculate(10009), 0);
        assertEquals(main.taxCalculate(10010), 1);
        assertEquals(main.taxCalculate(12000), 200);
        assertEquals(main.taxCalculate(56789), 8697);
        assertEquals(main.taxCalculate(1234567), 473326);

    }
}