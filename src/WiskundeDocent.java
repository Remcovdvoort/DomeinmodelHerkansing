public class WiskundeDocent extends Docent {
    public WiskundeDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void printCijfers(Student student) {
        System.out.println("Cijfers:");
        for (Double wiskunde : student.getWiskundeCijfers()) {
            System.out.println(wiskunde);
        }
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getWiskundeCijfers().add(cijfer);
        System.out.println("Cijfer is opgeslagen in wiskunde cijfers.");
    }
}
