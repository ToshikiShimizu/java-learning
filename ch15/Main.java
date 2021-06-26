import java.time.*;

public class Main {
    public static void main(String[] args){
        // 15-14
        Instant i1 = Instant.now();
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();

        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        System.out.println("" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
        System.out.println("" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
        if (z2.isEqual(z3)){
            System.out.println("isEqual");
        }

    }
}