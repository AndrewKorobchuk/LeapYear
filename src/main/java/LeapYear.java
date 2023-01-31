public class LeapYear {
    public static void leapYear(int year) {
        if(isLeapYear(year)){
            System.out.println(year + " is lap year.");
        } else {
            System.out.println(year + " is not lap year.");
        }
    }

    public static boolean isLeapYear(int year){
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}
