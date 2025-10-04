import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab;
    protected Random rand;
    
    /*
    * A "Thing" moves in a grid world. A TypeA Thing randomly
    * decides to turn left or right (or not turn) every "round",
    * and, afterward, takes a step forward.  A TypeB Thing
    * only considers making a random turn every 10th round.
    */

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = 0;
        this.timeSinceLast = 0;
        this.rand = new Random(System.currentTimeMillis());
    }

    //Turn Right
    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    //Turn Left
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public abstract void maybeTurn();

    //Move one step
    public void step() {
        //Row
        int[] dr = {1, 0, -1, 0};
        //Col
        int[] dc = {0, 1, 0, -1};
        row = row + dr[dir];
        col = col + dc[dir];
    }

    public String toString() {
        return row + " " + col + " " + lab;
    }
}
