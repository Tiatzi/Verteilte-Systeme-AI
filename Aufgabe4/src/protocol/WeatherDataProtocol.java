package protocol;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Describes the weather data protocol.
 */
public class WeatherDataProtocol {
    /**
     * The service port used by the server
     */
    public static final int SERVER_PORT = 7777;

    /**
     * The date format of the protocol
     */
    public static final DateTimeFormatter SERVER_DATE_FORMAT = DateTimeFormatter.BASIC_ISO_DATE;
    /**
     * Invalid date error return code
     */
    public static final String ERROR_DATE_PARSE = "-1";
    /**
     * No entry for date return code
     */
    public static final String ERROR_NO_INFO_FOR_DATE = "-2";

    /**
     * tries to parses the given data as a LocalDate and transforms it
     * into the server format specified by {@link WeatherDataProtocol#SERVER_DATE_FORMAT}
     *
     * @param requestData the date to parse
     * @return the parsed date in the server format specified by {@link WeatherDataProtocol#SERVER_DATE_FORMAT}
     * @throws java.time.DateTimeException if an error occured during parsing
     */
    public static LocalDate processRequest(String requestData) {
        LocalDate date = LocalDate.parse(requestData, WeatherDataProtocol.SERVER_DATE_FORMAT);
        return date;
    }

}
