import java.util.ArrayList;
import java.util.Scanner;

public class LogIn {

    private static LogIn singleton;
    private ArrayList<Gebruiker> gebruikers;
    private Gebruiker ge;

    private LogIn() {
        gebruikers = new ArrayList<> ();
        gebruikers.addAll(Student.students) ;
        gebruikers.addAll(Docent.docenten);
        gebruikers.add(new Student("Remco", "remco", "domeinmodel"));
        gebruikers.add(new WiskundeDocent("Karel", "karel", "Wiskunde"));
        gebruikers.add(new OPTDocent("Steven", "steven", "OPT"));
        gebruikers.add(new NatuurkundeDocent("Job", "job", "Natuurkunde"));
        ge = null;
    }

    public Gebruiker getLoggedIn(){
        return ge;
    }

    public static LogIn getInstance () {
        if (singleton == null) {
            singleton = new LogIn();
        }
        return singleton;
    }

    private boolean userExists (String naam) {

        for (Gebruiker ge : gebruikers) {
            if (ge.getGebruikersnaam ().equals (naam)) {
                this.ge = ge;
                return true;
            }
        }
        return false;
    }

    public boolean isAuthenticated () {
        if (ge != null) {
            return true;
        }
        else {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.print("Geef uw gebruikersnaam: ");
                String gebruikersnaam = scanner.nextLine();
                System.out.print ("Geef uw wachtwoord: ");
                String wachtwoord = scanner.nextLine();
                if (userExists (gebruikersnaam) && wachtwoord.equals(ge.getWachtwoord())) {
                    System.out.println ();
                    return true;
                }
                System.out.println ("De combinatie van je gebruikersnaam en wachtwoord kloppen niet.");
            }
            return false;
        }
    }

    public void logUit() {
        ge=null;
    }
}
