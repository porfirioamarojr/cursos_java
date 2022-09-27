package aula02;

public class Caneta{
    private String modelo;
    private String cor;
    private boolean tampada;
    private int carga;
    private float ponta;

    public Caneta(String m, String c, float p, int carg){
        this.tampar();
        this.cor = c;
        this.ponta = p;
        this.carga = carg;
        this.modelo = m;

    }

    public void status(){
        System.out.println("SOBRE A CANETA:\nModelo: "+this.modelo+"\nPonta: "+this.ponta+"\nCarga: "+this.carga+"%");
        System.out.println("Cor: " + this.cor+"\nTampada: " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, não posso rabiscar!");
        }else
            System.out.println("Eu posso rabiscar!");
        
    }
    public void destampar(){
        this.tampada = false;
    
    }
    public void tampar(){
        this.tampada = true;

    }

    public String getModelo(){
        return this.modelo;
    
    }

    public void setModelo(String m){
        this.modelo = m;

    }
    public String getCor(){
        return this.cor;
    
    }
    public void setCor(String c){
        this.cor = c;
    
    }
    public float getPonta(){
        return this.ponta;
    
    }
    public void setPonta(float p){
        this.ponta = p;
    
    }
    public int getCarga(){
        return this.carga;
    
    }
    public void setCarga(int carg){
        this.carga = carg;
    
    }
}