public class WiskundeDocent extends Docent {
    public WiskundeDocent(String naam, String gebruikersnaam, String wachtwoord) {
        super(naam, gebruikersnaam, wachtwoord);
    }

    @Override
    protected void printCijfers(Student student) {
        System.out.println("Cijfers van wiskunde van studentnummer: " + student.getStudentNummer());
        for (Double wiskunde : student.getCijferLijst().getWiskundeCijfers()) {
            if(student.getCijferLijst().getWiskundeCijfers().contains(null)){
                System.out.println("Er zijn geen cijfers gevonden");
            }
            else {
                System.out.println(wiskunde);
            }
        }
        System.out.println();
    }

    @Override
    protected void cijferOpslaan(Student st, double cijfer) {
        st.getCijferLijst().getWiskundeCijfers().add(cijfer);
        System.out.println("Cijfer is opgeslagen in wiskunde cijfers.");
    }
}
