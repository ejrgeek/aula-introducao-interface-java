package Model;

import Interface.IAcessoAoGitHub;

public class Desenvolvedor extends Funcionario implements IAcessoAoGitHub {

    public Desenvolvedor(String nome, String dataDeEntrada) {
        super(nome, dataDeEntrada);
    }


    @Override
    public void subirCodigo() {
        System.out.println("DEV: subiu um codigo");
    }

    @Override
    public void baixarCodigo() {
        System.out.println("DEV: Baixou um codigo");
    }
}
