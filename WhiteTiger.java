import java.awt.*;

public class WhiteTiger extends Critter {
    private boolean hasInfected = false;
    private final Color color = Color.WHITE;
    private final String TigerStr = "tgr";
    private final String TigerStrInfected = "TGR";

    public WhiteTiger() {
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            hasInfected = true;
            return Action.INFECT;
        }
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
        return color;
    }

    @Override
    public String toString() {
        if (hasInfected)
            return TigerStrInfected;
        else return TigerStr;
    }
}
