package qsh.learning.javaBeginner.data;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Timeline {


    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Europe/Paris");

        System.out.println("1/");
        LocalTime expected1 = LocalTime.of(12, 45, 5, 123456789);
        if (expected1.toString().equals("12:45:05.123456789")) {
            System.out.println("SUCCESS : " + expected1);
        } else {
            System.out.println("FAIL : " + expected1);
        }
        /* ######################################################## */

        System.out.println("2/");
        LocalDate expected2 = LocalDate.of(2012, 5, 6);
        if (expected2.toString().equals("2012-05-06")) {
            System.out.println("SUCCESS : " + expected2);
        } else {
            System.out.println("FAIL : " + expected2);
        }
        /* ######################################################## */

        System.out.println("3/");
        LocalDateTime expected3 = expected1.atDate(expected2);
        if (expected3.toString().equals("2012-05-06T12:45:05.123456789")) {
            System.out.println("SUCCESS : " + expected3);
        } else {
            System.out.println("FAIL : " + expected3);
        }
        /* ######################################################## */

        System.out.println("4/");
        ZonedDateTime expected4 = ZonedDateTime.of(expected3, zoneId);
        if (expected4.toString().equals("2012-05-06T12:45:05.123456789+02:00[Europe/Paris]")) {
            System.out.println("SUCCESS : " + expected4);
        } else {
            System.out.println("FAIL : " + expected4);
        }
        /* ######################################################## */

        System.out.println("5/");
        Instant expected5 = expected4.toInstant();
        if (expected5.toString().equals("2012-05-06T10:45:05.123456789Z")) {
            System.out.println("SUCCESS : " + expected5);
        } else {
            System.out.println("FAIL : " + expected5);
        }
        /* ######################################################## */

        System.out.println("6/");
        Clock expected6 = Clock.fixed(expected5, zoneId);
        if (expected6.toString().equals("FixedClock[2012-05-06T10:45:05.123456789Z,Europe/Paris]")) {
            System.out.println("SUCCESS : " + expected6);
        } else {
            System.out.println("FAIL : " + expected6);
        }
        /* ######################################################## */

        System.out.println("7/");
        Instant expected7 = Instant.now(expected6);
        if (expected7.toString().equals("2012-05-06T10:45:05.123456789Z")) {
            System.out.println("SUCCESS : " + expected7);
        } else {
            System.out.println("FAIL : " + expected7);
        }
        /* ######################################################## */

        System.out.println("8/");
        OffsetDateTime expected8 = expected3.atOffset(ZoneOffset.ofHours(5));
        if (expected8.toString().equals("2012-05-06T12:45:05.123456789+05:00")) {
            System.out.println("SUCCESS : " + expected8);
        } else {
            System.out.println("FAIL : " + expected8);
        }
        /* ######################################################## */

        System.out.println("9/");
        OffsetDateTime expected9 = expected8.withOffsetSameInstant(ZoneOffset.ofHours(7));
        if (expected9.toString().equals("2012-05-06T14:45:05.123456789+07:00")) {
            System.out.println("SUCCESS : " + expected9);
        } else {
            System.out.println("FAIL : " + expected9);
        }
        /* ######################################################## */

        System.out.println("10/");
        ZonedDateTime expected10 = expected9.atZoneSameInstant(zoneId);
        if (expected10.toString().equals("2012-05-06T09:45:05.123456789+02:00[Europe/Paris]")) {
            System.out.println("SUCCESS : " + expected10);
        } else {
            System.out.println("FAIL : " + expected10);
        }
        /* ######################################################## */

        System.out.println("11/");
        ZonedDateTime expected11 = expected9.atZoneSameInstant(ZoneId.of("Australia/Sydney"));
        if (expected11.toString().equals("2012-05-06T17:45:05.123456789+10:00[Australia/Sydney]")) {
            System.out.println("SUCCESS : " + expected11);
        } else {
            System.out.println("FAIL : " + expected11);
        }
        /* ######################################################## */

        System.out.println("12/");
        Duration expected12 = Duration.between(expected10, expected11);
        if (expected12.isZero()) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
        /* ######################################################## */

        System.out.println("13/");
        ZonedDateTime expected13 = expected11.plusHours(42).plusMinutes(21);
        if (expected13.toString().equals("2012-05-08T12:06:05.123456789+10:00[Australia/Sydney]")) {
            System.out.println("SUCCESS : " + expected13);
        } else {
            System.out.println("FAIL : " + expected13);
        }
        /* ######################################################## */

        System.out.println("14/");
        Duration expected14 = Duration.between(expected11, expected13);
        if (expected14.toString().equals("PT42H21M")) {
            System.out.println("SUCCESS : " + expected14);
        } else {
            System.out.println("FAIL : " + expected14);
        }
        /* ######################################################## */

        System.out.println("15/");
        long expected15 = expected14.toSeconds();
        if (expected15 == 152460) {
            System.out.println("SUCCESS : " + expected15);
        } else {
            System.out.println("FAIL : " + expected15);
        }
        /* ######################################################## */

        System.out.println("16/");
        Period expected16 = Period.parse("P1Y2M3D");
        if (expected16.getYears() == 1 && expected16.getMonths() == 2 && expected16.getDays() == 3) {
            System.out.println("SUCCESS : " + expected16);
        } else {
            System.out.println("FAIL : " + expected16);
        }
        /* ######################################################## */

        System.out.println("17/");
        Period expected17 = expected16.plus(expected16);
        if (expected17.getYears() == 2 && expected17.getMonths() == 4 && expected17.getDays() == 6) {
            System.out.println("SUCCESS : " + expected17);
        } else {
            System.out.println("FAIL : " + expected17);
        }
        /* ######################################################## */

        System.out.println("18/");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2018, 12, 23, 11, 45, 8, 0, ZoneId.of("Europe/Paris"));
        String expected19 = zonedDateTime.format(DateTimeFormatter.ofPattern("EEEE dd LLLL yyyy HH.mm.ss"));
        if (expected19.equals("dimanche 23 décembre 2018 11.45.08")) {
            System.out.println("SUCCESS : " + expected19);
        } else {
            System.out.println("FAIL : " + expected19);
        }
        /* ######################################################## */

        System.out.println("19/");
        LocalDate date1 = LocalDate.of(2015, 11, 16);
        LocalDate date2 = LocalDate.of(2015, 11, 18);
        LocalDate date3 = LocalDate.of(2014, 9, 18);
        LocalDate date4 = LocalDate.of(2015, 11, 16);

        System.out.println(compare(date1, date2));
        System.out.println(compare(date3, date1));
        System.out.println(compare(date3, date2));
        System.out.println(compare(date3, date4));
        System.out.println(compare(date4, date2));
    }

    private static String compare(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            return "SUCCESS";
        } else {
            return "FAILED";
        }
    }
}
