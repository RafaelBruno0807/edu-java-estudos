public class SmartTv{

    Boolean ligada = false;
    Integer canal = 4;
    Integer volume = 50;

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume +: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume -: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal +: ");
    }

    public void reduzirCanal(){
        canal--;
        System.out.println("Canal -: ");

    }

    public void selecionarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando canal para: " + novoCanal);
    }

}