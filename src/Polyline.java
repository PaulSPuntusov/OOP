import java.util.Arrays;

public class Polyline {
    Dot[] dots;

    public Polyline(Dot... dots) {
        this.dots = dots;
    }

    @Override
    public String toString() {
        return "Polyline{" +
                "dots=" + Arrays.toString(dots) +
                '}';
    }

    public Line[] getLines() {
        Line[] lines = new Line[dots.length - 1];
        for (int i = 0; i < dots.length - 1; i++) {
            lines[i] = new Line(dots[i], dots[i + 1]);
        }
        return lines;
    }

    public double getLengthByLines() {
        double res = 0;
        Line[] lines = getLines();
        for (int i = 0; i < getLines().length; i++) {
            res += lines[i].getLength();
        }
        return res;
    }
    public double getLength(){
        double res = 0;
        for(int i=0; i< dots.length-1; i++){
            Line line = new Line(dots[i],dots[i+1]);
            res += line.getLength();
        }
        return res;
    }
}
