package br.com.Produtividade;

public class SwitchCase {
    public static void main(String[] args) {

        String nome = "Joao";
        switch (nome) {
            case "Renata" -> System.out.println("Acertou " + nome);
            case "Joao" -> System.out.println("Acertou " + nome);
            default -> System.out.println("Nenhum nome encontrado");

//            -----------ANTES
//            case "Renata": {
//                System.out.println("Acertou " + nome);
//                break;
//            }
//            case "Joao": {
//                System.out.println("Acertou " + nome);
//
//                break;
//            }
//            default:
//                System.out.println("Nenhum nome encontrado!!");
//
        }



    }
}
