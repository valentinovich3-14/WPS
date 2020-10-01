public class Pipe {
    private int idX;
    private int idY;
    private int length;

    public Pipe(int idX, int idY, int length) {
        this.idX = idX;
        this.idY = idY;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Pipe{" +
                " idX=" + idX +
                ", idY=" + idY +
                ", length=" + length +
                '}';
    }



    public int getIdX() {
        return idX;
    }

    public void setIdX(int idX) {
        this.idX = idX;
    }

    public int getIdY() {
        return idY;
    }

    public void setIdY(int idY) {
        this.idY = idY;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
