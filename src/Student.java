import java.util.ArrayList;

    public class Student extends Gebruiker{

        public Student(String naam, String gebruikersnaam, String wachtwoord, ArrayList<Double> wiskundeCijfers, ArrayList<Double> OPTCijfers, ArrayList<Double> natuurkundeCijfers) {
            super(naam, gebruikersnaam, wachtwoord, wiskundeCijfers, OPTCijfers, natuurkundeCijfers);
        }

        public boolean cijferCheck(ArrayList<Double> cijfers, Integer aantalToetsen) {
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
            if (cijfers.size() != aantalToetsen) {
                return false;
            }
            return true;
        }
    }

