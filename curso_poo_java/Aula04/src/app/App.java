package app;

public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c = new ControleRemoto();
        //c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();

    }
}