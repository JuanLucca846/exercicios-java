public class App {
    public static void main(String[] args) throws Exception {
        
        boolean resultado;
        boolean resultado1;

        if(10 == 10 && 10 > 20){
            resultado = true;
        }else{
            resultado = false;
        }

        if(5 < 10 || 5 > 10){
            resultado1 = true;
        }else{
            resultado1 = false;
        }
        
        System.out.println(resultado);
        System.out.println(resultado1);
    }
}
