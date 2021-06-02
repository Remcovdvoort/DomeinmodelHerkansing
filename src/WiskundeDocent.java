public class WiskundeDocent extends Docent {
    public WiskundeDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getWiskundeCijfers().add(cijfer);
    }
}
