public class App {
    public static void main(String[] args) throws Exception {
        
        final Veiculo veiculo;

        veiculo = new Veiculo("vermelho", "4", "FORD");

        veiculo.setCor("Rosa");

        System.out.println(veiculo.getCor() + " - " + veiculo.getRodas() + " - " + veiculo.getMarca());
        

        veiculo.veiculoAndar();
        veiculo.veiculoFreiar();
    }
}
