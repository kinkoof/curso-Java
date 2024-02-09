package encapsulacao;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    Carro(String marca, String modelo, int ano) {
        // this.marca = marca;
        // this.modelo = modelo;
        // this.ano = ano;

        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
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

    @Override
    public String toString() {
        return getMarca() + getModelo() + getAno();
    }

}
