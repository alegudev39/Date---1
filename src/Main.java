import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
        public class Main {

    public static void main(String[] args) {

        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = parseDate(dateString);

        DateTimeFormatter fullFormatter = formatFull();
        DateTimeFormatter mediumFormatter = formatMedium();
        DateTimeFormatter shortFormatter = formatShort();

        System.out.println("Full: " + dateTime.format(fullFormatter));
        System.out.println("Med: " + dateTime.format(mediumFormatter));
        System.out.println("Short: " + dateTime.format(shortFormatter));
    }

    private static DateTimeFormatter formatShort() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    private static DateTimeFormatter formatMedium() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    private static DateTimeFormatter formatFull() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssxxxxx");
    }

    static OffsetDateTime parseDate(String dateString) {
        return OffsetDateTime.parse(dateString);
    }
}