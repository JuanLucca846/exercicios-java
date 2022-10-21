public class Veiculo {
    public String cor;
    public String rodas;
    public String marca;

    public Veiculo(String cor, String rodas, String marca){
        this.cor = cor;
        this.rodas = rodas;
        this.marca = marca;
    }

    public void veiculoAndar(){
        System.out.println("Veiculo está andando!");

    } 

    public void veiculoFreiar(){
        System.out.println("Veiculo está freiando!");

    }
}
