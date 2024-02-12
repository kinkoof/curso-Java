package modificadores_acesso.package2;

import modificadores_acesso.package1.*;

public class C {

    String defaultMessage = "Assim é o padrão"; //é visivel apenas para os que estejam no mesmo package
    public String publicMessage = "mensagem publica"; // é acessivel para todos
    private String privateMessage = "mensagem privada"; // so é visivel para a classe que contenha ela
    protected String protectedMessage = "mensagem protegida"; // oque é protected é acessivel apenas para quem filho

}
