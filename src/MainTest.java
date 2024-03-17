import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {
    @Test
    public void testParseDate(){
    String dateString = "2002-03-01T13:00:00Z";
    OffsetDateTime dateTime = Main.parseDate(dateString);
    OffsetDateTime expectedDate = OffsetDateTime.parse(dateString);

    assertEquals(expectedDate , dateTime);
}

}