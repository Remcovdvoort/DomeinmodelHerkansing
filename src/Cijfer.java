public class Cijfer {
        private Double cijfer;

        public Cijfer(Double cijfer){
            this.cijfer=cijfer;
        }


        public static double bepaalCijfer(double cijfer, Integer dagenTelaat, boolean plagiaat, boolean bonusOpdracht, boolean githubInvite){

            if(dagenTelaat >2){
                return 1.0;
            }
            else if(dagenTelaat>0 && dagenTelaat<=2){
                cijfer-=2;
            }
            if(plagiaat){
                return 1.0;
            }
            if(bonusOpdracht){
                cijfer+=2;
            }
            if(githubInvite){
                cijfer+=1;
            }else{
                cijfer-=0.5;
            }
            return cijfer;
        }
        public String getBeoordeling(){
            if(cijfer>=1.0 && cijfer<5.5){
                return "Onvoldoende";
            }
            if(cijfer>=5.5 && cijfer<7.0){
                return "Ruim voldoende";
            }
            if(cijfer>=7.0 && cijfer<=10.0){
                return "Goed";
            }
            return "Foutief cijfer ingevoerd";
        }
    }

