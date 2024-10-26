package entities;

public class Moto {

	public String marca;
    public String modelo;
    public String cor;
    public int marcha;

    public Moto(String marca, String modelo, String cor, int marcha) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Marcha atual: " + marcha);
    }

    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha >= 0) {  
            marcha = novaMarcha;
            System.out.println("Marcha trocada para: " + marcha);
        } 
        else {
            System.out.println("Marcha inválida!");
        }
    }
}
