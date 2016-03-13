package Lab2_2__3;

/**
 * Created by Alex on 13.03.2016.
 */
public class Employee {
    String name;
    double salary = 0.0;



    public void calcSalary(String name, double salary) {
        this.name = name;
        this.salary +=salary;

        System.out.println(name +" " + this.salary);
    }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

}
