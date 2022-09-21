package Model;

import Interface.IAcessoAdministrativo;

import java.util.Calendar;

public class Administrador extends Funcionario implements IAcessoAdministrativo {
    public Administrador(String nome, String dataDeEntrada) {
        super(nome, dataDeEntrada);
    }

    @Override
    public void acessarListaDeFuncionarios() {
        System.out.println("ADM: Acesso a lista de funcionarios");
    }

    @Override
    public void acessarAvaliacaoTrimestral() {
        System.out.println("ADM: Acesso a avaliacao trimestral");
    }

    @Override
    public void acessarAvaliacaoTrimestral(Funcionario funcionario) {
        System.out.println("ADM: Acesso a avaliacao trimestral do funcionario: " + funcionario);
    }
}
