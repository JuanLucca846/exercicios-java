public class App {
    public static void main(String[] args) throws Exception {
        
        final Veiculo veiculo;

        veiculo = new Veiculo();

        veiculo.cor = "Vermelho";
        veiculo.rodas = "4";
        veiculo.marca = "FORD";

        System.out.println(veiculo.cor);
        System.out.println(veiculo.rodas);
        System.out.println(veiculo.marca);

        veiculo.veiculoAndar();
        veiculo.veiculoFreiar();
    }
}