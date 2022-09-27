package app;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        setVolume(getVolume() + 50);
        setLigado(false);
        setTocando(false);

    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setVolume(int vol) {
        this.volume = vol;

    }
    private int getVolume(){
        return this.volume;

    }
    //Abstract Methods
    @Override
    public void ligar() {
        this.setLigado(true);
    
    }
    @Override
    public void desliligar() {
        this.setLigado(false);
    
    }
    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("*************MENU*************");
            System.out.print("Está ligado? "+this.getLigado()+"\nEsta Tocando? "+this.getTocando()+"\nVolume: "+this.getVolume());
            for(int i = 0; i <= this.getVolume(); i += 10)
                System.out.print(" #");
        
            System.out.println("");
        }else
            System.out.println("Impossivel abrir Menu!");

    }
    @Override
    public void fecharMenu() {
        if(this.getLigado())
            System.out.println("Fechou menu!");
    
    }
    @Override
    public void maisVolume() {
        if(this.getLigado())
            this.setVolume(this.getVolume() + 5);
        else
            System.out.println("Impossivel aumentar volume!");

    }
    @Override
    public void menosVolume() {
        if(this.getLigado())
            this.setVolume(this.getVolume() - 5);
        else
            System.out.println("Impossivel diminuir volume!");
    
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0)
            this.setVolume(0);
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0)
            this.setVolume(50);

    }
    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando()))
            this.setTocando(true);
        else
            System.out.println("Não foi possivel reproduzir!");

    }
    @Override
    public void pause() {
        if(this.getTocando() && (this.getTocando()))
            this.setTocando(false);
        else
            System.out.println("Não foi possivel pausar!");
    
    }
}