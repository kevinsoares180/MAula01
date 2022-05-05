package one.digitalinnovation.basecamp;

public class Emprestimo {

    public static void getEmprestimo(float valor, int parcelas, int taxa)
    {
        float result = ( taxa * valor)  / parcelas;

        System.out.println("Você vai pagar "+result + " durante " + parcelas + " meses");
    }
}
