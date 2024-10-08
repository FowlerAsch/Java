import java.util.Scanner;

public class ConvertendoDataEmTexto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        String mesTexto = mesPorExtenso(mes);

        if (mesTexto != null) {
            System.out.println(dia + " de " + mesTexto + " de " + ano);
        } else {
            System.out.println("Mês inválido.");
        }

        sc.close();
    }

    public static String mesPorExtenso(int mes) {
        switch (mes) {
            case 1:
                return "janeiro";
            case 2:
                return "fevereiro";
            case 3:
                return "março";
            case 4:
                return "abril";
            case 5:
                return "maio";
            case 6:
                return "junho";
            case 7:
                return "julho";
            case 8:
                return "agosto";
            case 9:
                return "setembro";
            case 10:
                return "outubro";
            case 11:
                return "novembro";
            case 12:
                return "dezembro";
            default:
                return null;  
        }
    }
}
