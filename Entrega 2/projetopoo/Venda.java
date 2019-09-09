package projetopoo;

public class Venda {
    int codigoViagem;
    int quantidadeVagas;
    String passageiros;
    double preço;
    boolean servicoDeBordo;
    double tarifa;

    public Venda(int codigoViagem, int quantidadeVagas, String passageiros, double preço, boolean servicoDeBordo, double tarifa) {
        this.codigoViagem = codigoViagem;
        this.quantidadeVagas = quantidadeVagas;
        this.passageiros = passageiros;
        this.preço = preço;
        this.servicoDeBordo = servicoDeBordo;
        this.tarifa = tarifa;
    }
    
    
}
