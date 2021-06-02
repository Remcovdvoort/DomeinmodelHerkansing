import java.util.ArrayList;

public abstract class Gebruiker {


    private String naam;
    private String gebruikersnaam;
    private String wachtwoord;


    public Gebruiker(String naam, String gebruikersnaam, String wachtwoord) {
        this.naam = naam;
        this.gebruikersnaam= gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }
    public String vakLijst(ArrayList<Double> wiskundeCijfers, ArrayList<Double> OPTCijfers, ArrayList<Double> natuurkundeCijfers) {
        for(String naam:Docent.docentNamen) {
            if(naam.equals("Karel")){
                System.out.println(wiskundeCijfers);
            }
            if(naam.equals("Steven")){
                System.out.println(OPTCijfers);
            }
            if(naam.equals("Jan")){
                System.out.println(natuurkundeCijfers);
            }
        }
    }
}
