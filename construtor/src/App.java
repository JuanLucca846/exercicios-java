public class App {
    public static void main(String[] args) throws Exception {
        
        final Veiculo veiculo;

        veiculo = new Veiculo("vermelho", "4", "FORD");

        

        System.out.println(veiculo.cor);
        System.out.println(veiculo.rodas);
        System.out.println(veiculo.marca);

        veiculo.veiculoAndar();
        veiculo.veiculoFreiar();
    }
}