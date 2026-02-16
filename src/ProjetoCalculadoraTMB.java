import java.util.Scanner;
public class ProjetoCalculadoraTMB {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua Idade: ");
        // TODO: Implementar validação para impedir idades negativas
        int idade = entrada.nextInt();
        System.out.print("Digite seu Peso: ");
        double pesoKg = entrada.nextDouble();
        System.out.print("Digite sua Altura (CM): ");
        int alturaCm = entrada.nextInt();
        System.out.print("Digite seu Gênero (M) ou (F): ");
        char genero = entrada.next().charAt(0);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Sedentário - Pouco ou nenhum exercício: (1)");
        System.out.println("Levemente Ativo - Exercício leve 1-3 dias/semana: (2)");
        System.out.println("Moderadamente Ativo - Exercício moderado 3-5 dias/semana: (3)");
        System.out.println("Muito Ativo - Exercício pesado 6-7 dias/semana: (4)");
        System.out.println("Extremamente Ativo - Trabalho físico pesado ou treino atleta: (5)");
        System.out.println("-----------------------------------------------------------------");


        System.out.print("Com base nos valores acima, digite seu Nível de Atividade Física: ");
        int nivelDeAtividadeFisica = entrada.nextInt();


        double taxaMetabolicaBasal = 0;
        double gastoEnergeticoTotal;
        double valorNivelDeAtividadeFisica = switch (nivelDeAtividadeFisica){
            case 1 -> 1.2;
            case 2 -> 1.375;
            case 3 -> 1.55;
            case 4 -> 1.725;
            case 5 -> 1.9;
            default -> 1;
        };


        if (genero == ('M') || genero == 'm' ){
            // Cálculo baseado na Equação de Harris-Benedict (revisão de 1984)
            taxaMetabolicaBasal = 88.362 + (13.397 * pesoKg) + (4.799 * alturaCm) - (5.677 * idade);
        }
        else if (genero == ('F') || genero == 'f'){
            taxaMetabolicaBasal = 447.593 + (9.247 * pesoKg) + (3.098 * alturaCm) - (4.330 * idade);
        }else {
            System.out.printf("Gênero Inválido!");
        }

        gastoEnergeticoTotal = taxaMetabolicaBasal * valorNivelDeAtividadeFisica;
        System.out.printf("%s, sua TMB é %.2f kcal e seu Gasto Total é %.2f kcal.%n",
                nome, taxaMetabolicaBasal, gastoEnergeticoTotal);

        entrada.close();

    }


}
