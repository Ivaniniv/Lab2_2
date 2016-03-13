package Lab2_2__4;

/**
 * Created by Alex on 13.03.2016.
 */
public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;


    public void person (String firstName, String lastName){
        System.out.println(firstName +" " + lastName);
    }
    public void person (int age){
        System.out.println("Age " + age);
    }
    public void person (String gender, int phoneNumber){
        System.out.println(gender + phoneNumber);
    }
}
