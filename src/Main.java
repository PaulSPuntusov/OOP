import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       City a = new City("A");
       City b = new City("B");
       City c = new City("C");
       City d = new City("D");
       City e = new City("E");
       City f = new City("F");
        a.addRoute(b,5);
        a.addRoute(f,1);
        a.addRoute(d,6);
        b.addRoute(a,5);
        b.addRoute(c,3);
        c.addRoute(d,4);
        c.addRoute(b,3);
        d.addRoute(c,4);
        d.addRoute(e,2);
        e.addRoute(f,2);
        f.addRoute(b,1);
        f.addRoute(a,6);
        // System.out.println(a.toString());
        System.out.println(b.travelBy(3));

    }
}