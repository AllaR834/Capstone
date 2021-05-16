import java.awt.*;

public class Bear extends Critter {
    private boolean polar;
    private int numMoves;
    private final Color cWHITE = Color.WHITE;
    private final Color cBlack = Color.BLACK;

    public Bear(boolean polar) {
        this.polar = polar;
        numMoves = 0;
    }

    public Action getMove(CritterInfo info) {
        numMoves ++;
        if (info.frontThreat())
            return Action.INFECT;
        else {
            if (info.getFront() == Neighbor.EMPTY)
                return Action.HOP;
            else
                return Action.LEFT;
        }
     }

    public Color getColor() {
        if (polar)
            return cWHITE;
        else
            return cBlack;
    }

    public String toString() {
        //return super.toString();
        if (numMoves % 2 == 0)
            return BEAR_STRING.SLASH.toString();
        else
            return BEAR_STRING.BACKSLASH.toString();
    }
}
