package Week4;

public class Student {
    private int IDnumber;
    private double credithours;
    private int points;


    public Student() {

        IDnumber = 9999;
        credithours = 3;
        points = 12;
    }

    void setHours(double newCredithours) {
        this.credithours = newCredithours;
    }

    void setPoints(int newPoints) {
        this.points = newPoints;
    }

    void setIDnumber(int newId) {
        IDnumber = newId;
    }

    double getCredithours() {
        return this.credithours;
    }

    int getPoints() {
        return this.points;
    }

    int getIDnumber() {
        return this.IDnumber;
    }

    double gpa() {
        return this.points / this.credithours;
    }

}


/*public class Student(int IDnumber, double credithours,
        int points;) {

        super(9999, 3, 12);*/
/*
public Student(int startIDnumber, double startcredithours, int startpoints) {
*/


    /*public Student(int startIDnumber, double startcredithours, int startpoints) {

        if (startIDnumber.isEmpty()) {
            IDnumber = 9999;
        }
        if (startcredithours == 0) {
            credithours = 3;
        }
        if (startpoints == 0) {
            points = 12;
        }*/