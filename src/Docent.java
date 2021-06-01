import java.util.ArrayList;

public class Docent extends Gebruiker {

    public static ArrayList<String> docentNamen = new ArrayList<>();
    public Docent(String naam, String gebruikersnaam, String wachtwoord, ArrayList<Double> wiskundeCijfers, ArrayList<Double> OPTCijfers, ArrayList<Double> natuurkundeCijfers) {
        super(naam, gebruikersnaam, wachtwoord, wiskundeCijfers, OPTCijfers, natuurkundeCijfers);
    }

}
