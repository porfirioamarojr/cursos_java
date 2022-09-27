package aula03;

public class Aula03 {
    public static void main(final String[] args) throws Exception {
        Conta p1 = new Conta();
        p1.setNum_conta(1111);
        p1.setNome("Amaro");
        p1.openAccount("CC");

        Conta p2 = new Conta();
        p2.setNome("Ilana");
        p2.openAccount("CP");

        p1.depositar(300);
        p2.depositar(500);

        p2.sacar(100);
        p1.sacar(350);
        p1.closedAccount();

        p1.state();
        p2.state();
    }
}