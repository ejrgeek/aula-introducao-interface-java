package Interface;

import Model.Funcionario;

public interface IAcessoAdministrativo {

    public void acessarListaDeFuncionarios();

    public void acessarAvaliacaoTrimestral();

    public void acessarAvaliacaoTrimestral(Funcionario funcionario);

}
