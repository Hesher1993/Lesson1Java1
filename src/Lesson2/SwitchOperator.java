package Lesson2;

public class SwitchOperator {
    public static void main (String[] args){
        String month = "December";
        int daysNumber = getNumberOfDaysInMonth (month);
        System.out.println(month + " has " + daysNumber + "days");
    }

    public static int getNumberOfDaysInMonth(String month) {
        if (month.equals("January")){
            return 31;
        }

        return 0;
    }
}
