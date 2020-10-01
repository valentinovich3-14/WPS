import java.util.ArrayList;
import java.util.List;

public class Way {
    private int a;
    private List<Integer> way = new ArrayList<>();
    private int b;
    private int length;

    public Way(int a, int b, int length) {
        this.a = a;
        this.b = b;
        this.length = length;
        way.get(a);
    }

    public List<Integer> getWay() {
        return way;
    }

    public void setWay(List<Integer> way) {
        this.way = way;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
