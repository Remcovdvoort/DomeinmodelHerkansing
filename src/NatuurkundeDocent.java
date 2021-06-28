public class NatuurkundeDocent extends Docent{
    public NatuurkundeDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void printCijfers(Student student) {
        System.out.println("Cijfers van natuurkunde van studentnummer: " + student.getStudentNummer());
        for (Double natuurkunde : student.getCijferLijst().getNatuurkundeCijfers()) {
            System.out.println(natuurkunde);
        }
        System.out.println();
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getCijferLijst().getNatuurkundeCijfers().add(cijfer);
        System.out.println("Cijfer is opgeslagen in natuurkunde cijfers.");
    }
}
