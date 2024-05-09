public class SmartTv {

        int volume = 1;
        int canal = 25;
        boolean ligada = false;

        public void mudarCanal(int NovoCanal){
            canal = NovoCanal;
        }

        public void aumentarCanal(){
            canal++;
        }
        public void diminuirCanal(){
            canal--;
          
        }

        public void aumentarVolume(){
            volume++;

            System.out.println("Aumentando o Volume para : " + volume);
        }
        public void diminuirVolume(){
            volume--;

            System.out.println("Diminuindo o Volume para : " + volume);
        }
        
        public void ligar(){
            ligada=true;
        }
        public void desligar(){
            ligada=false;
        }

}
