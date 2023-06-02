package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String isLeap = "not leap";

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = "leap";
                }
            } else {
                isLeap = "leap";
            }
        }
        System.out.println(isLeap);
    }
}
