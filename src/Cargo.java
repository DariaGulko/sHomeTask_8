/**
 * Created by Dariya on 24.10.2015.
 */
public class Cargo extends Car implements Track,Rally{
    private static final int speed=100;

    @Override
    void go() {
        System.out.println("Cargo");
    }
}
