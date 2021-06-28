import java.util.ArrayList;

public class CijferLijst {
    private ArrayList<Double> wiskundeCijfers = new ArrayList<>();
    private ArrayList<Double> natuurkundeCijfers = new ArrayList<>();
    private ArrayList<Double> OPTCijfers = new ArrayList<>();

    public ArrayList<Double> getWiskundeCijfers() {
        return wiskundeCijfers;
    }

    public ArrayList<Double> getNatuurkundeCijfers() {
        return natuurkundeCijfers;
    }

    public ArrayList<Double> getOPTCijfers() {
        return OPTCijfers;
    }

    public boolean cijferCheck(ArrayList<Double> cijfers) {
        double gemiddelde = 0.0;
        for (Double c : cijfers) {
            gemiddelde += c;
            if (c < 4.5) {
                return false;
            }
        }
        gemiddelde /= cijfers.size();
        if (gemiddelde < 5.5) {
            return false;
        }
        if (cijfers.size() < 2) {
            return false;
        }
        return true;
    }
}
