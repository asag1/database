import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDuplicateCharacters {
    DuplicateCharacters DC = new DuplicateCharacters();
    Map<String, Long> result = new HashMap<>();

    @Test
    void modifyTextTest() {
        result.put("a", 2L);
        result.put("i", 1L);
        result.put("o", 2L);
        assertEquals(result, DC.modifyText("o aa io"));
    }

    @Test
    public void getDuplicateCharactersTest() {
        result.put("a", 2L);
        result.put("i", 1L);
        result.put("o", 2L);
        assertEquals("a, o", DC.getDuplicateCharacters(result));
    }

    @Test
    void getHowManyDuplicatesTest() {
        result.put("a", 2L);
        result.put("i", 1L);
        result.put("o", 2L);
        assertEquals("a:2, o:2", DC.howManyDuplicates(result));
    }
}
