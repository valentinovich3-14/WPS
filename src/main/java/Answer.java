import java.util.ArrayList;
import java.util.List;

public class Answer {
    private boolean route;
    private int length;
    private List<Integer> way;



    public Answer() {
        route = false;
        length = 0;
        way = new ArrayList<>();
    }

    public List<Integer> getWay() {
        return way;
    }

    public void addWay(Integer point) {
        way.add(point);
    }

    public boolean isRoute() {
        return route;
    }

    public void setRoute(boolean route) {
        this.route = route;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        if(route){
            return "Answer{" +
                    "route=" + route +
                    ", length=" + length +
                    ", way=" + way +
                    '}';
        }else {
            return "Answer{" +
                    "route=" + route +
                    '}';
        }

    }
}
