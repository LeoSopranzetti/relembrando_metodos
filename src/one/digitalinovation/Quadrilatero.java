package one.digitalinovation;

public class Quadrilatero {

    public static double area(double lado){
        double valorFinal =  lado * lado;
        System.out.println("Área do quadrado:" + valorFinal);
        return valorFinal;
    }

    public static double area(double ladoMaior, double ladoMenor){
        double valorFinal =  ladoMaior * ladoMenor;
        System.out.println("Área do retangulo:" + valorFinal);
        return valorFinal;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        double valorFinal =  ((baseMaior+baseMenor) * altura) / 2;
        System.out.println("Área do trapézio:" + valorFinal);
        return valorFinal;

    }

}
