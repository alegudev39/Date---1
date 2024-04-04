import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
public class Main {
    public static void main(String[] args) {

        String dateString = "2002-03-01T13:00:00Z";
        // DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        System.out.println("offsetDateTime: " + offsetDateTime);
        System.out.println("formatShort: " + formatShort(offsetDateTime));
        System.out.println("formatMedium: " + formatMedium(offsetDateTime));
        System.out.println("formatFull: " + formatFull(offsetDateTime));

    }

    public static String formatShort(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

    public static String formatMedium(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public static String formatFull(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

}