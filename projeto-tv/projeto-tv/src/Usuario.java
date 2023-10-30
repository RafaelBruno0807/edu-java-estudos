public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.aumentarCanal();

        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.selecionarCanal(20);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);


    }
}
