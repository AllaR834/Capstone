import java.awt.*;

public class Giant extends Critter {
    private int numMovesSerial;
    private Color color = Color.GRAY;

    public Giant() {
        numMovesSerial = 0;
    }

    @Override
    public Action getMove(CritterInfo info) {
        numMovesSerial ++;
        if (info.frontThreat())
            return Action.INFECT;
        else {
            if (info.getFront() == Neighbor.EMPTY)
                return Action.HOP;
            else return Action.RIGHT;
        }
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        int res = numMovesSerial / 6;
        GIANT_STRING retString = GIANT_STRING.string1_6;
        switch (res) {
            case 0:
                retString = GIANT_STRING.string1_6;
                break;
            case 1:
                retString = GIANT_STRING.string7_12;
                break;
            case 2:
                retString = GIANT_STRING.string13_18;
                break;
            case 3:
                retString = GIANT_STRING.string19_24;
                break;
            case 4:
                retString = GIANT_STRING.string1_6;
                numMovesSerial = 0;
                break;
        }
        return retString.toString();
    }
}
