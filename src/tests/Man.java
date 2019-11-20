package tests;

public class Man extends Human {
    int height;
    Man(int age, int height, String ethnicity){
        super(age,ethnicity);
        this.height = height;
    }
    void tooString(){
        System.out.println("This man is "+ age + " years old and " + height + "cm tall" );
    }

    int sum(){
        System.out.println(ethnicity + "age: " + age + "Height: " + height);
        return age+height;
    }
}
