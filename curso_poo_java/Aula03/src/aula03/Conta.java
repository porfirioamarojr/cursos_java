package aula03;

public class Conta {
    public int num_conta;
    private String nome;
    private double saldo;
    private double limite;
    private boolean status;
    protected String tipo;

    
    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    
    }
    public void state(){
        System.out.println("#####################################################");
        System.out.println("Número: "+this.getNum_conta()+"\nNome: "+this.getNome()+"\nSaldo: "
        +this.getSaldo()+"\nStatus: "+this.getStatus()+"\nTipo: "+this.getTipo());

    }
    public void openAccount(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC")
            this.setSaldo(50);
        else if (t == "CP")
            this.setSaldo(150);
        System.out.println("Conta aberta com Sucesso!");
        
    }
    public void closedAccount(){
        if (this.getSaldo() > 0)
            System.out.println("Your account have money!!!");
        else if (this.getSaldo() < 0)
            System.out.println("Your account dont have money!!!");
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        
        }
    }
    public void depositar(double v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito relaizado com sucesso na conta de " + this.getNome());
        }else
            System.out.println("Impossivel depositar!");

    }
    public void sacar(double v){
        if (this.getStatus() == true)
            if(this.getSaldo() >= v)
                this.setSaldo(this.getSaldo() - v);
            else
                System.out.println("Saldo insuficiente!");
        else
            System.out.println("Impossivel sacar!");

    }
    public void pagarConta(){
        float v = 0;
        if(this.getTipo() == "CC")
            v = 12;
        else if(this.getTipo() == "CP")
            v = 20;

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por "+this.getNome());
        }else                
            System.out.println("Impossivel pagar uma conta fechada!");
    
    }
    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    
    }
    public int getNum_conta() {
        return num_conta;

    }
    public void setNome(String nome) {
        this.nome = nome;
    
    }
    public String getNome() {
        return nome;

    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    
    }
    public String getTipo() {
        return tipo;

    }
    public void setStatus(boolean status){
        this.status = status;
    
    }
    public boolean getStatus(){
        return this.status;
    
    }
    public void setSaldo(double sal) {
        this.saldo = sal;
        
    }
    public double getSaldo(){
        return this.saldo;
    
    }
    public void setLimite(double limit){
        this.limite = limit;

    }
    public double getLimit(){
        return this.limite;

    }
}