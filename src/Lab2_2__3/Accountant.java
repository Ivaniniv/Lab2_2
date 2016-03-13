package Lab2_2__3;

/**
 * Created by Alex on 13.03.2016.
 */
public class Accountant {
public static void main (String [] args){
    Employee Sidorov = new Employee();
    Employee Petrov = new Employee();
    Employee Dudka = new Employee();
    Employee Kotov = new Employee();
    Employee Gorin = new Employee();

    Sidorov.calcSalary("Sidorov", 153.5);
    Petrov.calcSalary("Petrov", 456.5);
    Dudka.calcSalary("Dudka", 12312.5);
    Kotov.calcSalary("Kotov", 34234.5);
    Gorin.calcSalary("Gorin", 42342.5);

    Sidorov.calcSalary("Sidorov", 234.4);

}

}

