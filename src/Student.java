import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Gebruiker {

    private ArrayList<Double> wiskundeCijfers = new ArrayList<>();
    private ArrayList<Double> natuurkundeCijfers = new ArrayList<>();
    private ArrayList<Double> OPTCijfers = new ArrayList<>();
    private Integer studentNummer;
    private static Integer vorigStudentNummer = 0;
    public static ArrayList<Student> students = new ArrayList<>();


    public Student(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
        studentNummer = vorigStudentNummer++;
        students.add(this);
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

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public static Student getStudent(Integer studentNummer) {
        for (Student s : students) {
            if (s.studentNummer == studentNummer) {
                return s;
            }
        }
        System.out.println("Student niet gevonden...\n");
        return null;
    }

    public void printCijfers(ArrayList<Double> cijfers) {
        for (Double c : cijfers) {
            System.out.println(c);
        }
    }

    public ArrayList<Double> getWiskundeCijfers() {
        return wiskundeCijfers;
    }

    public ArrayList<Double> getNatuurkundeCijfers() {
        return natuurkundeCijfers;
    }

    public ArrayList<Double> getOPTCijfers() {
        return OPTCijfers;
    }

    public void printMenu() {
        Scanner sc = new Scanner(System.in);
        int keuze;
        System.out.println("Menu");
        System.out.println("1) Cijfers bekijken");
        System.out.println("2) Kijken welke vakken je hebt behaald");
        System.out.println("3) Loguit");
        keuze = sc.nextInt();
        switch (keuze) {
            case 1:
                cijfersBekijken();
                break;
            case 2:
                if(cijferCheck(wiskundeCijfers)){
                    System.out.println("Voor het vak wiskunde heb je het gemiddelde, alles boven de 4.5 en het aantaltoetsen behaald");
                }
                else {
                    System.out.println("Voor het vak wiskunde is een of meer van de requirements niet behaald");
                }
                if(cijferCheck(OPTCijfers)){
                    System.out.println("voor het vak OPT heb je het gemiddelde, alles boven de 4.5 en het aantaltoetsen behaald");
                }
                else {
                    System.out.println("Voor het vak OPT is een of meer van de requirements niet behaald");
                }
                if(cijferCheck(natuurkundeCijfers)){
                    System.out.println("voor het vak natuurkunde heb je het gemiddelde, alles boven de 4.5 en het aantaltoetsen behaald");
                }
                else {
                    System.out.println("voor het vak natuurkunde is een of meer van de requirements niet behaald");
                }
                break;
            case 3: LogIn.getInstance().logUit();
        }
    }

    public void cijfersBekijken() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kies je vak:");
        System.out.println("1) Wiskunde cijfers");
        System.out.println("2) OPT cijfers");
        System.out.println("3) Natuurkunde Cijfers");
        int keuze = sc.nextInt();
        switch (keuze) {
            case 1: {
                printCijfers(wiskundeCijfers);
            }
            case 2: {
                printCijfers(OPTCijfers);
            }
            case 3: {
                printCijfers(natuurkundeCijfers);
            }
        }
    }
}

