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

        Operadores.comparacaoOperadoresRelacionais(10, 20, 4.5f, 3.5f, 'x', 'y', "Fulano", "Fulano", true, false);

        Condicoes.mesDoAno(1);
        Condicoes.mesDoAno(2);
        Condicoes.mesDoAno(3);
        Condicoes.mesDoAno(4);
        Condicoes.mesDoAno(5);
        Condicoes.mesDoAno(6);
        Condicoes.mesDoAno(7);
        Condicoes.mesDoAno(8);
        Condicoes.mesDoAno(9);
        Condicoes.mesDoAno(10);
        Condicoes.mesDoAno(11);
        Condicoes.mesDoAno(12);

        Condicoes.mesFerias("janeiro");
        Condicoes.mesFerias("julho");
        Condicoes.mesFerias("dezembro");

        Condicoes.switchSemana("Segunda");
        Condicoes.switchSemana("Terça");
        Condicoes.switchSemana("Quarta");
        Condicoes.switchSemana("Quinta");
        Condicoes.switchSemana("Sexta");
        Condicoes.switchSemana("Sabado");
        Condicoes.switchSemana("Domingo");
        Condicoes.switchSemana("Teste");


    }
}
