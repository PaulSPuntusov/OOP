public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot(1, 3);
        Dot dot2 = new Dot(15, 19);
        Dot dot3 = new Dot(5, 8);
        Dot dot4 = new Dot(10, 11);
        Line l1 = new Line(dot1,dot3);
        Line l2 = new Line(dot4,dot2);
        Line l3 = new Line(dot3,dot4);
        System.out.println("Линия1: "+l1);
        System.out.println("Линия2: "+l2);
        System.out.println("Линия3: "+l3);
        l3.begin.x = 56;
        l3.finish.y = 100;
        System.out.println("Линия1: "+l1);
        System.out.println("Линия2: "+l2);
        System.out.println("Линия3: "+l3);
        System.out.println(l1.getLength()+l2.getLength()+ l3.getLength());
    }
}