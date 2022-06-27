package one.digitalinovation;

public class Condicoes {

    public static void mesDoAno (int numeroDoMes){
        if (numeroDoMes == 1){
            System.out.println("Janeiro");
        } else if (numeroDoMes == 2){
            System.out.println("Fevereiro");
        } else if (numeroDoMes == 3){
            System.out.println("Março");
        } else if (numeroDoMes == 4){
            System.out.println("Abril");
        } else if (numeroDoMes == 5){
            System.out.println("Maio");
        } else if (numeroDoMes == 6){
            System.out.println("Junho");
        } else if (numeroDoMes == 7){
            System.out.println("Julho");
        } else if (numeroDoMes == 8){
            System.out.println("Agosto");
        } else if (numeroDoMes == 9){
            System.out.println("Setembro");
        } else if (numeroDoMes == 10){
            System.out.println("Outrubo");
        } else if (numeroDoMes == 11){
            System.out.println("Novembro");
        } else if (numeroDoMes == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Valor invalido");
        }
    }

    public static void mesFerias(String mes){
        String mesMinusculo = mes.toLowerCase();
        if(mesMinusculo == "julho" || mesMinusculo == "dezembro" || mesMinusculo == "janeiro"){
            System.out.println("Ferias");
        }
    }

    public static void switchSemana (String dia){
        switch (dia){
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sabado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(0);
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
    }
}
