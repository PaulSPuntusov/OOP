public class Line {
    Dot begin, finish;

    public Line(int xBegin, int yBegin, int xFinish, int yFinish) {
        this(new Dot(xBegin, yBegin), new Dot(xFinish, yFinish));
    }

    public Line(Dot begin, Dot finish) {
        this.begin = begin;
        this.finish = finish;
    }

    public double getLength() {
        return Math.sqrt(((begin.x - finish.x) * (begin.x - finish.x)) +
                ((begin.y - finish.y) * (begin.y - finish.y)));
    }
    @Override
    public String toString() {
        return "Линия от {"
                + begin +
                " до " + finish +
                '}';
    }
}
