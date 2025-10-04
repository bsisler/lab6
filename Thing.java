import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char. lab;
    protected Random rand;

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0;
        this.timeSinceLast = 0;
        this.rand = new Random(System.currentTimeMillis());
    }
}
