package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Calculadora {

    public static void soma(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("A soma de "+num1 + " e "+num2 + " é "+result);
    }
    public static void subtracao(double num1, double num2){
        double result = num1 - num2;
        System.out.println("A subtracao de "+num1 + " e "+num2 + " é "+result);
    }
    public static void multiplicacao(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("A multiplicacao de "+num1 + " e "+num2 + " é "+result);
    }
    public static void divisao(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("A divisão de "+num1 + " e "+num2 + " é "+result);
    }
}
