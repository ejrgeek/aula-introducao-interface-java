package Model;

import Interface.IAcessoFinanceiro;

public class AnalistaContabil extends Funcionario implements IAcessoFinanceiro {
    public AnalistaContabil(String nome, String dataDeEntrada) {
        super(nome, dataDeEntrada);
    }

    @Override
    public void listarContasAPagar() {
        System.out.println("ANC: lista de contas a pagar");
    }

    @Override
    public void gerarImpostoDeRenda() {
        System.out.println("ANC: gerar imposto de renda");
    }
}
