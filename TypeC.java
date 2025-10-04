public class TypeC extends Thing{
    public TypeC (int row, int col, char lab) {
        super(row, col, lab);
    }
    private boolean diagonal = true;
    public void maybeTurn() {
        if (diagonal == true) {
            leftTurn();
        } else {
            rightTurn();
        }
        diagonal = !diagonal;
    }
}
