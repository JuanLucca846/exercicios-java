public class App {
    public static void main(String[] args) throws Exception {
        
        final Carro carro;

        carro = new Carro("Preto", "4", "FORD");

        System.out.println(carro.getCor() + " - " + carro.getRodas() + " - " + carro.getMarca());

        
    }
}