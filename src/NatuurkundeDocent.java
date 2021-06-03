public class NatuurkundeDocent extends Docent{
    public NatuurkundeDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void printCijfers(Student student) {
        System.out.println("Cijfers:");
        for (Double natuurkunde : student.getNatuurkundeCijfers()) {
            System.out.println(natuurkunde);
        }
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getNatuurkundeCijfers().add(cijfer);
        System.out.println("Cijfer is opgeslagen in natuurkunde cijfers.");
    }
}
