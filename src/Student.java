import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Gebruiker {
    private Integer studentNummer;
    private static Integer vorigStudentNummer = 0;
    public static ArrayList<Student> students = new ArrayList<>();
    private CijferLijst cijferLijst;


    public Student(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
        studentNummer = vorigStudentNummer++;
        students.add(this);
    }

    public CijferLijst getCijferLijst() {
        return cijferLijst;
    }

    public Integer getStudentNummer() {
        return studentNummer;
    }

    public static Student getStudent(Integer studentNummer) {
        for (Student s : students) {
            if (s.studentNummer.equals(studentNummer)) {
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



    public void printMenu() {
        Scanner sc = new Scanner(System.in);
        int keuze;
        System.out.println("Menu");
        System.out.println("1) Cijfers bekijken");
        System.out.println("2) Kijken welke vakken je hebt behaald");
        System.out.println("3) Zie studenten nummer");
        System.out.println("4) Loguit");
        keuze = sc.nextInt();
        switch (keuze) {
            case 1:
                cijfersBekijken();
                break;
            case 2:
                if(cijferLijst.cijferCheck(cijferLijst.getWiskundeCijfers())){
                    System.out.println("Voor het vak wiskunde heb je het gemiddelde, alles boven de 4.5 en het aantaltoetsen behaald");
                }
                else {
                    System.out.println("Voor het vak wiskunde is een of meer van de requirements niet behaald");
                }
                if(cijferLijst.cijferCheck(cijferLijst.getOPTCijfers())){
                    System.out.println("voor het vak OPT heb je het gemiddelde, alles boven de 4.5 en het aantaltoetsen behaald");
                }
                else {
                    System.out.println("Voor het vak OPT is een of meer van de requirements niet behaald");
                }
                if(cijferLijst.cijferCheck(cijferLijst.getNatuurkundeCijfers())){
                    System.out.println("voor het vak natuurkunde heb je het gemiddelde, alles boven de 4.5 en het aantaltoetsen behaald");
                }
                else {
                    System.out.println("voor het vak natuurkunde is een of meer van de requirements niet behaald");
                }
                break;
            case 3:
                viewStudentNummer();
                break;
            case 4: LogIn.getInstance().logUit();
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
                System.out.println("Uw cijfers voor wiskunde:");
                printCijfers(cijferLijst.getWiskundeCijfers());
                System.out.println();
                break;
            }
            case 2: {
                System.out.println("Uw cijfers voor OPT:");
                printCijfers(cijferLijst.getOPTCijfers());
                System.out.println();
                break;
            }
            case 3: {
                System.out.println("Uw cijfers voor natuurkunde:");
                printCijfers(cijferLijst.getNatuurkundeCijfers());
                System.out.println();
                break;
            }
        }
    }

    public void viewStudentNummer(){
        System.out.println("Dit is uw studenten nummer:\n" + getStudentNummer()+ "\n");
    }
}

