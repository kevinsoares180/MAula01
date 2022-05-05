package one.digitalinnovation.basecamp;

public class Mensagem {

        public static void getHora(int hora) {
        if(hora >= 5 && hora <= 12) {
            System.out.println("Bom Dia");
        }
        else if(hora >= 13 && hora <= 18) {
            System.out.println("Boa Tarde");
        }
        else {
            System.out.println("Boa Noite");
        }
}
