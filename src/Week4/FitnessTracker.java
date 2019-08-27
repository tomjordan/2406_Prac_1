package Week4;

public class FitnessTracker {

    private int minutes;
    private int year = 2019;
    private int day;
    private String month;

    public FitnessTracker() {
        this.day = 1;
        this.month = "January";
        this.minutes = 0;
    }

    public FitnessTracker(int day, String month, int year, int minutes) {
        this.day = day;
        this.month = month;
        this.minutes = minutes;
        this.year = year;
    }


    int getMinutes() {
        return this.minutes;
    }

    int getYear() {
        return this.year;
    }

    int getDay() {
        return this.day;
    }

    String getMonth() {
        return this.month;
    }

}
