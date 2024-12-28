import com.example.FelineInterface;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    FelineInterface felineInterface;
    Lion lion;

    @Before
    public void before() throws Exception {
        felineInterface = Mockito.mock(FelineInterface.class);
        lion = new Lion("Самец", felineInterface);
    }

    @Test(expected = Exception.class)
    public void testLionException() throws Exception {
        new Lion("львенок", felineInterface);
    }

    @Test
    public void testGetKittens() {
        Mockito.when(felineInterface.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(felineInterface.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
