import java.util.ArrayList;

    public class Student extends Gebruiker{

        private ArrayList<Double> wiskundeCijfers;
        private ArrayList<Double> natuurkundeCijfers;
        private ArrayList<Double> OPTCijfers;
        private Integer studentNummer;
        private static Integer vorigStudentNummer = 0;
        public static ArrayList<Student> students = new ArrayList<>();


        public Student(String naam, String gebruikersnaam, String wachtwoord) {
            super(naam, gebruikersnaam, wachtwoord);
            studentNummer= vorigStudentNummer++;
            students.add(this);
        }

        public boolean cijferCheck(ArrayList<Double> cijfers, Integer aantalToetsen) {
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
            if (cijfers.size() != aantalToetsen) {
                return false;
            }
            return true;
        }

        public static Student getStudent(Integer studentNummer){
            for(Student s: students){
                if(s.studentNummer==studentNummer){
                    return s;
                }
            }
            System.out.println("Student niet gevonden...\n");
            return null;
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
    }

