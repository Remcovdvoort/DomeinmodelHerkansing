public class OPTDocent extends Docent{

    public OPTDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getOPTCijfers().add(cijfer);
        System.out.println("Cijfer is opgeslagen in OPT cijfers.");
    }
}
