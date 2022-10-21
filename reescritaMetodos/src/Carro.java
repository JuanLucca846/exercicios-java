public class Carro extends Veiculo{

    public Carro(String cor, String rodas, String marca) {
        super(cor, rodas, marca);
    }

    @Override
    public void veiculoAndar() {
        // TODO Auto-generated method stub
        System.out.println("Carro está andando");
    }

    @Override
    public void veiculoFreiar() {
        // TODO Auto-generated method stub
        System.out.println("Carro está freiando!");
    }

}