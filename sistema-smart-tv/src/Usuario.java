public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("- Status TV -");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume da TV: " +smartTv.volume);

        smartTv.ligar();
        smartTv.mudarCanal(4);
        smartTv.reduzirVolume();
        System.out.println("- Status TV -");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume da TV: " +smartTv.volume);



    }
}
