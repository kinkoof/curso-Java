package modificadores_acesso.package2;

import modificadores_acesso.package1.*;

public class C {

    String defaultMessage = "Assim é o padrão";
    public String publicMessage = "mensagem publica";
    private String privateMessage = "mensagem privada";
    protected String protectedMessage = "mensagem protegida"; // oque é protected é acessivel apenas para quem filho

}
