public class NatuurkundeDocent extends Docent{
    public NatuurkundeDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getNatuurkundeCijfers().add(cijfer);
    }
}
