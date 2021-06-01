import java.util.ArrayList;

public abstract class Gebruiker {
    private ArrayList<Double> wiskundeCijfers;
    private ArrayList<Double> natuurkundeCijfers;
    private ArrayList<Double> OPTCijfers;

    private String naam;
    private String gebruikersnaam;
    private String wachtwoord;

    public Gebruiker(String naam, String gebruikersnaam, String wachtwoord, ArrayList<Double> wiskundeCijfers, ArrayList<Double> OPTCijfers, ArrayList<Double> natuurkundeCijfers) {
        this.natuurkundeCijfers = natuurkundeCijfers;
        this.wiskundeCijfers = wiskundeCijfers;
        this.OPTCijfers = OPTCijfers;
        this.naam = naam;
        this.gebruikersnaam= gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }
    public String vakLijst(String naam, ArrayList<Double> wiskunde, ArrayList<Double> OPTCijfers, ArrayList<Double> natuurkundeCijfers) {
        for(naam : Docent.docentNamen) {
            if(naam== "Karel"){
                System.out.println(wiskunde);
            }
            if(naam=="Steven"){
                System.out.println(OPTCijfers);
            }
            if(naam=="Jan"){
                System.out.println(natuurkundeCijfers);
            }
        }
    }
}
