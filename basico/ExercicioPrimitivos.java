package flamingo.aula.revisao.basico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExercicioPrimitivos {

    /* Eu <nome>, morando no endereço <endereco>,
    * confirmo o salario de <salario> na data <data> */

    static void main() {

        DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nome = "Ana";
        String endereco = "Rua Ilha";
        double salario = 5000.00;
        LocalDate hoje = LocalDate.now();

        System.out.println("Eu, " + nome + ", morando no endereço: " + endereco
                + ", confirmo o salário de " + salario + " na data: " + hoje.format(formatoBrasileiro));
    }
}
