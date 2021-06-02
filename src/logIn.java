import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    private static Login singleton;
    private ArrayList<Gebruiker> gebruikers;
    private Gebruiker ge;

    private Login () {
        gebruikers = new ArrayList<> ();
        gebruikers.add(new Gebruiker("x", "y") {
        });
        gebruikers.add(new Gebruiker("a", "b") {
        });
        gebruikers.add(new Gebruiker("k", "l") {
        });
        ge = null;
    }

    public static Login getInstance () {

        if (singleton == null) {
            singleton = new Login ();
        }

        return singleton;
    }

    private boolean userExists (String name) {

        for (Gebruiker ge : gebruikers) {
            if (ge.getName ().equals (name)) {
                this.ge = ge;
                return true;
            }
        }

        return false;
    }

    public boolean userIsAuthenticated () {
        return ge != null;
    }

    public boolean isAuthenticated () {

        if (userIsAuthenticated ()) {
            return true;
        }
        else {

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {

                System.out.println ("=================");
                System.out.print("Met welke gebruikersnaam wilt u inloggen? ");
                String userName = scanner.nextLine();
                System.out.print ("Graag het bijbehorende password: ");
                String password = scanner.nextLine();
                System.out.println ("=================");

                if (userExists (userName) && ge.passwordIsCorrect(password)) {
                    System.out.println ();
                    return true;
                }

                System.out.println ("De combinatie van gebruikersnaam en password is niet OK.");
            }

            System.out.println ("=================");
            System.out.println ();
            return false;
        }
    }
}
