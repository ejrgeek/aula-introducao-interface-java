package Model;

import Interface.IAcessoAdministrativo;
import Interface.IAcessoFinanceiro;


public class DonoDaEmpresa extends Funcionario implements IAcessoAdministrativo, IAcessoFinanceiro {
    public DonoDaEmpresa(String nome, String dataDeEntrada) {
        super(nome, dataDeEntrada);
    }

    @Override
    public void acessarListaDeFuncionarios() {
        System.out.println("DONO DA EMPRESA: Lista de funcionarios");
    }

    @Override
    public void acessarAvaliacaoTrimestral() {
        System.out.println("DONO DA EMPRESA: Avaliacao trimestral de todos");
    }

    @Override
    public void acessarAvaliacaoTrimestral(Funcionario funcionario) {
        System.out.println("DONO DA EMPRESA: Avaliacao do Funcionario: " + funcionario);
    }

    @Override
    public void listarContasAPagar() {
        System.out.println("DONO DA EMPRESA: Listar contas a pagar");
    }

    @Override
    public void gerarImpostoDeRenda() {
        System.out.println("DONO DA EMPRESA: gerar imposto de renda");
    }
}
