package Model;

public class Funcionario {

    String nome;
    String dataDeEntrada;

    public Funcionario(String nome, String dataDeEntrada) {
        this.nome = nome;
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", dataDeEntrada='" + dataDeEntrada + '\'' +
                '}';
    }
}
