import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
        public class Main {

    public static void main(String[] args) {

        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = parseDate(dateString);

        String fullFormatter = formatFull(dateTime);
        String mediumFormatter = formatMedium(dateTime);
        String shortFormatter = formatShort(dateTime);

        System.out.println("Full: " + fullFormatter);
        System.out.println("Med: " + mediumFormatter);
        System.out.println("Short: " + shortFormatter);
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

    public static OffsetDateTime parseDate(String dateString) {
        return OffsetDateTime.parse(dateString);
    }
}