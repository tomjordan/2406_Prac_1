package Week4;

public class Student {
    private int IDnumber;
    private double credithours;
    private int points;

    void setHours(double hours){
        this.credithours = hours;
    }

    void setPoints(int pointtot){
        this.points = pointtot;
    }

    double getCredithours(){
        return this.credithours;
    }

    int getPoints(){
        return this.points;
    }

    double gpa(){
        return this.points/this.credithours;
    }

    /*double gpa(int gpapoint, double gpahours ){
        return gpapoint/gpahours;
    }*/
}
