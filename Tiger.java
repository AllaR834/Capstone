import java.awt.*;

public class Tiger extends Critter {
    private int numMoves;
    private Color currentColor;
    private final Color[] color = {Color.RED,Color.GREEN,Color.BLUE};
    private final String TigerStr = "TGR";

    public Tiger() {
        numMoves = 0;
    }

    @Override
    public Action getMove(CritterInfo info) {
        numMoves ++;

        if (info.frontThreat())
            return Action.INFECT;
        else {
             if (info.getFront() == Neighbor.WALL)
                 return Action.LEFT;
             if (info.getRight() == Neighbor.WALL)
                 return Action.LEFT;
             if (info.getFront() == Neighbor.SAME)
                 return Action.RIGHT;
             else return Action.HOP;
        }
    }

    @Override
    public Color getColor() {
        if (numMoves % 3 == 0) {
            int numColor = 1 + (int) (Math.random() * 3);
            currentColor = color[numColor - 1];
        }
        return currentColor;
    }

    @Override
    public String toString() {
        return TigerStr;
    }
}
