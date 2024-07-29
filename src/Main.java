import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       City m = new City("Moskow");
       City s = new City("SPb");
       City o = new City("Orel");
       City k = new City("Kazan");
        m.addRoute(s,5);
        s.addRoute(o,6);
        o.addRoute(k,7);
        k.addRoute(m,8);
        Route rsm = new Route(m,5);
        Route rom = new Route(m,6);
        Route rkm = new Route(m,7);
        s.addRoute(rsm);
        o.addRoute(rom);
        k.addRoute(rkm);
        System.out.println(m.toString());
        System.out.println(k.travelBy(9));

    }
}