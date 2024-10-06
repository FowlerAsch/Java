/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.4*/

/*"Read the start time and the end time of a game. Then, 
calculate the duration of the game, knowing that it can start
on one day and end on another, with a minimum duration of 1 hour and a maximum of 24 hours." */

import java.util.Scanner;

public class HorarioPartida {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o horário inicial da partida: ");
        double horarioInicial = sc.nextDouble();

        System.out.println("Digite o horário Final da partida: ");
        double horarioFinal = sc.nextDouble();

        double duracao = calcularHorario(horarioInicial, horarioFinal);

        System.out.println("A duração do jogo foi de " + duracao + " hora(s).");

        sc.close();

    }

    private static double calcularHorario(double horarioInicial, double horarioFinal){

        if (horarioInicial < horarioFinal) { // se a partida terminar no mesmo dia

            return horarioFinal - horarioInicial;
 
        } else { // se a partida terminar no dia seguinte

            return 24 - horarioInicial + horarioFinal;
        }

    }
}
