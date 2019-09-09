package projetopoo;

public class Viagem {
    
    int codigoViagem;
    String destino;
    String origem;
    double horarioSaida;
    double horarioChegada;
    int quantidadeVagas;
    String passageiros;
    int codigoOnibus;
    String nomeMotorista;
    double preço;
    boolean servicoDeBordo;
    double tarifa;

    public Viagem(int codigoViagem, String destino, String origem, double horarioSaida, double horarioChegada, int quantidadeVagas, String passageiros, int codigoOnibus, String nomeMotorista, double preço, boolean servicoDeBordo, double tarifa) {
        this.codigoViagem = codigoViagem;
        this.destino = destino;
        this.origem = origem;
        this.horarioSaida = horarioSaida;
        this.horarioChegada = horarioChegada;
        this.quantidadeVagas = quantidadeVagas;
        this.passageiros = passageiros;
        this.codigoOnibus = codigoOnibus;
        this.nomeMotorista = nomeMotorista;
        this.preço = preço;
        this.servicoDeBordo = servicoDeBordo;
        this.tarifa = tarifa;
    }
    
    
    
        
}
