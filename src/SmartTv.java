public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public int mudarCanal(int Canal){
        this.canal = Canal;

        return canal;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;

    }public void diminuirVolume(){
        volume--;
    }



}
