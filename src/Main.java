import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
        public class Main {

    public static void main(String[] args) {

        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssxxxxx");
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Full: " + dateTime.format(fullFormatter));
        System.out.println("Med: " + dateTime.format(mediumFormatter));
        System.out.println("Short: " + dateTime.format(shortFormatter));
    }
}