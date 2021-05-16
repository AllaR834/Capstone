import java.awt.*;

public class NinjaCat extends Critter {
    public NinjaCat() {
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.frontThreat()){
            return Action.INFECT;
        }
        else {
            Neighbor neighbor = info.getFront();
            if (neighbor == Neighbor.WALL)
                return Action.LEFT;
            else if (neighbor == Neighbor.EMPTY)
                return Action.HOP;
            else
                return Action.RIGHT;
        }
    }

    @Override
    public Color getColor() {
        return Color.MAGENTA;
    }

    @Override
    public String toString() {
        return "C";
    }
}
