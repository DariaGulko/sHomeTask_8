/**
 * Created by Dariya on 24.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Racing car1 = new Racing();
        car1.go();
        Cargo car2=new Cargo();
        System.out.println(((Rally)car2).go());
    }
}
