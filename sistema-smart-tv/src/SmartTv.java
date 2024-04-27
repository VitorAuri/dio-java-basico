public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public int aumentarVolume(){
        return ++volume;
    }
    public int reduzirVolume(){
        return --volume;
    }
    public int mudarCanal(int a){
        return canal = a;
    }
}
