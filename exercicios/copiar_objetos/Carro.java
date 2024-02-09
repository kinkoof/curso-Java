package copiar_objetos;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    Carro(String marca, String modelo, int ano) {

        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    Carro(Carro x) {
        this.copy(x);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void copy(Carro x) {
        this.setModelo(x.getModelo());
        this.setMarca(x.getMarca());
        this.setAno(x.getAno());
    }

}
