package Lab2_2__1_2;

/**
 * Created by Alex on 15.02.2016.
*/
public class Runer {
    public static void main(String[] args) {

        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        Matrix m3 = new Matrix();

        m1.setMatrix();
        m2.setMatrix();
        m3.multiplication(m1.getMatrix(), m2.getMatrix());

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);


    }
}
