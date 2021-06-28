public class OPTDocent extends Docent{

    public OPTDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void printCijfers(Student student) {
        System.out.println("Cijfers van OPT van studentnummer: " + student.getStudentNummer());
        for (Double optCijfer : student.getCijferLijst().getOPTCijfers()) {
            System.out.println(optCijfer);
        }
        System.out.println();
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getCijferLijst().getOPTCijfers().add(cijfer);
        System.out.println("Cijfer is opgeslagen in OPT cijfers.");
    }
}
