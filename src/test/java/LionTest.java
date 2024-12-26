import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    FelineInterface felineInterface;

    @Test
    public void testLionMale() throws Exception {
        Lion lion = new Lion("Самец");
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testLionFemale() throws Exception {
        Lion lion = new Lion("Самка");
        boolean expectedResult = false;
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = Exception.class)
    public void testLionException() throws Exception {
        new Lion("львенок");
    }
    @Test
    public void testGetKittens() {
        Lion lion = new Lion(felineInterface);
        Mockito.when(felineInterface.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(felineInterface);
        Mockito.when(felineInterface.eatMeat()).thenReturn(List.of("Хищник"));
        assertEquals(List.of("Хищник"), lion.getFood());
    }
}
