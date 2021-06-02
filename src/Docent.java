import java.util.ArrayList;
import java.util.Scanner;

public abstract class Docent extends Gebruiker {

    public static ArrayList<String> docentNamen = new ArrayList<>();

    public Docent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);

    }

    public void cijferToevoegen(){
        Scanner sc = new Scanner(System.in);
        Student st = null;
        while(st == null){
            System.out.println("Geef het studentnummer van de student:");
            Integer studentNummer = sc.nextInt();
            st = Student.getStudent(studentNummer);
        }

        System.out.println("Voer het cijfer in:");
        double cijfer = sc.nextDouble();
        System.out.println("Voer het aantal dagen te laat in:");
        Integer dagenTelaat = sc.nextInt();
        System.out.println("Geef aan of de student plagiaat heeft gepleegd ('true'/'false'):");
        boolean plagiaat = sc.nextBoolean();
        System.out.println("Geef aan of de student de bonusopdracht heeft gemaakt ('true'/'false'):");
        boolean bonusOpdracht = sc.nextBoolean();
        System.out.println("Geef aan of de student een Github invite heeft gestuurd naar de docent ('true'/'false'):");
        boolean githubInvite = sc.nextBoolean();
        cijfer = bepaalCijfer(cijfer, dagenTelaat, plagiaat, bonusOpdracht, githubInvite );
        cijferOpslaan(st, cijfer);
    }

    protected abstract void cijferOpslaan(Student st, double cijfer);


    public static double bepaalCijfer(double cijfer, Integer dagenTelaat, boolean plagiaat, boolean bonusOpdracht, boolean githubInvite){

        if(dagenTelaat >2){
            return 1.0;
        }
        else if(dagenTelaat>0 && dagenTelaat<=2){
            cijfer-=2;
        }
        if(plagiaat){
            return 1.0;
        }
        if(bonusOpdracht){
            cijfer+=2;
        }
        if(githubInvite){
            cijfer+=1;
        }else{
            cijfer-=0.5;
        }
        if(cijfer>10.0){
            return 10.0;
        }
        return cijfer;
    }
}
