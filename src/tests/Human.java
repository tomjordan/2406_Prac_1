package tests;

public abstract class Human {
int age;
String ethnicity;
    Human(int age, String ethnicity){
        this.age = age;
        this.ethnicity = ethnicity;
    }

    abstract void tooString();
    abstract int sum();



}
