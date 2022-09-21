package Main;

import Model.Administrador;
import Model.Desenvolvedor;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev = new Desenvolvedor(
                "Joao", "20/09/2022"
        );

        dev.subirCodigo();

        Administrador adm = new Administrador("Paulo", "21/09/2022");

        adm.acessarAvaliacaoTrimestral();
        adm.acessarAvaliacaoTrimestral(dev);


    }
}
