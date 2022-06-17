package one.digitalinovation;

public class Calculadora {

    public static void soma(double valor1, double valor2){
        double resultado = valor1 + valor2;

        System.out.println("A soma deu: " + resultado);
    }

    public static void subtracao(double valor1, double valor2){
        double resultado = valor1 - valor2;

        System.out.println("A subtracao deu: " + resultado);
    }

    public static void multiplicacao(double valor1, double valor2){
        double resultado = valor1 * valor2;

        System.out.println("A multiplicacao deu: " + resultado);
    }

    public static void divisao(double valor1, double valor2){
        double resultado = valor1 / valor2;

        System.out.println("A divisao deu: " + resultado);
    }
}
