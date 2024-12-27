import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline;

    @Before
    public void before() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetFamily() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetKittens() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittensTest() {
        int expectedResult = 1;
        int actualResult = feline.getKittens(1);
        assertEquals(expectedResult, actualResult);
    }
}
