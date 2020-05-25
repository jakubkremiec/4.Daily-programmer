import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class MainTest {

    Main main = new Main();

    @Test
    public void test_points_calculation(){

        assertEquals(main.calculatePointForEverySideOfRoll(1,2,3,4,5),5);
        assertEquals(main.calculatePointForEverySideOfRoll(2,3,5,5,6),10);
        assertEquals(main.calculatePointForEverySideOfRoll(1,1,1,1,3),4);
        assertEquals(main.calculatePointForEverySideOfRoll(1,1,1,3,3),6);
        assertEquals(main.calculatePointForEverySideOfRoll(1,2,3,4,5),5);
        assertEquals(main.calculatePointForEverySideOfRoll(6,6,6,6,6),30);
    }
}