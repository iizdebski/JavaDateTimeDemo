package zoneddatetime;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeTest{

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");

        /*Set<String>availableZoneIds = ZoneId.getAvailableZoneIds();
        ((Set) availableZoneIds).forEach(System.out::println);
        */

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime);
        LocalDateTime localDateTime= LocalDateTime.of(2019, Month.FEBRUARY, 20, 06, 30);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);

        System.out.println(offsetDateTime);
    }
}