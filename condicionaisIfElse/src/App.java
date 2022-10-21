public class App {
    public static void main(String[] args) throws Exception {

        if(true){
            System.out.println("verdadeiro");
        }else{
            System.out.println("falso");
        }
        
        String sexo = "Feminino";

        if(sexo == "Masculino"){
            System.out.println("Sexo Masculino");
        }else if(sexo == "Feminino"){
            System.out.println("Sexo Feminino");
        }

        int idade = 51;

        if(idade <= 10){
            System.out.println("Crianca");
        }else if(idade <= 17){
            System.out.println("Adolescente");
        }else{
            System.out.println("Adulto");
        }

    }
}
