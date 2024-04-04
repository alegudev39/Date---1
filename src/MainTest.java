
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void formatShort() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedDate = Main.formatShort(dateTime);
        String expectedFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        assertEquals(expectedFormattedDate, formattedDate);

    }

    @Test
    public void formatMedium() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedDate = Main.formatMedium(dateTime);
        String expectedFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        assertEquals(expectedFormattedDate, formattedDate);

    }

    @Test
    public void formatFull() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formattedDate = Main.formatFull(dateTime);
        String expectedFormattedDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        assertEquals(expectedFormattedDate, formattedDate);

    }
}
