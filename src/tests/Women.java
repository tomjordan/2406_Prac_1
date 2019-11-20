package tests;

public class Women extends Human {
    int height;

    Women(int age, int height, String ethnicity){
        super(age,ethnicity);
        this.height = height;
    }

    void tooString(){
        System.out.println( "This woman is "+ age + " years old and " + height + "cm tall" );
    }

    int sum(){
        System.out.println(ethnicity + "age: " + age + "Height: " + height);
        return age+height;
    }

}
