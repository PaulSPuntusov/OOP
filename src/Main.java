import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot(1, 5);
        Dot dot2 = new Dot(2, 8);
        Dot dot3 = new Dot(5, 3);
        Dot dot4 = new Dot(8, 9);
        Polyline p1 = new Polyline(dot1,dot2,dot3,dot4);
        System.out.println(p1);
        System.out.println(Arrays.toString(p1.getLines()));
        System.out.println(p1.getLengthByLines());
        System.out.println(p1.getLength());
        System.out.println(p1.getLengthByLines()==p1.getLength());
        dot2.setX(12);
        dot2.setY(8);
        System.out.println(p1);
        System.out.println(Arrays.toString(p1.getLines()));
        System.out.println(p1.getLengthByLines());
        System.out.println(p1.getLength());
        System.out.println(p1.getLengthByLines()==p1.getLength());
    }
}