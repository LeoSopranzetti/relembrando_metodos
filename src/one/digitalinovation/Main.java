package one.digitalinovation;

public class Main {

    public static void main(String[] args) {
        Calculadora.soma(5, 5);
        Calculadora.subtracao(5, 5);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(5, 5);

        Saudacao.mensagem(9);
        Saudacao.mensagem(14);
        Saudacao.mensagem(1);

        Emprestimo.calculo(1000, 2);
        Emprestimo.calculo(1000, 3);
        Emprestimo.calculo(1000, 5);

        Quadrilatero.area(2);
        Quadrilatero.area(2, 2);
        Quadrilatero.area(2, 2, 2);
    }
}
