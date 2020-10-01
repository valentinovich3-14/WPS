public class Point {

    public int IdA;
    public int IdB;

    public Point(int idA, int idB) {
        IdA = idA;
        IdB = idB;
    }

    public int getIdA() {
        return IdA;
    }

    public void setIdA(int idA) {
        IdA = idA;
    }

    public int getIdB() {
        return IdB;
    }

    public void setIdB(int idB) {
        IdB = idB;
    }

    @Override
    public String toString() {
        return "Point{" +
                "IdA=" + IdA +
                ", IdB=" + IdB +
                '}';
    }
}
