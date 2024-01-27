import java.sql.SQLOutput;

public class ListaClientes {
    public static void main(String[] args) {
        // Cliente 1
        String nomeCliente1 = "Fulano";
        int anoNascimentoCliente1 = 1980;

        // Cliente 2
        String nomeCliente2 = "Sicrano";
        int anoNascimentoCliente2 = 2000;

        // Obter ano atual
        int anoAtual = java.time.Year.now().getValue();

        // Calcular idade dos clientes
        int idadeCliente1 = anoAtual - anoNascimentoCliente1;
        int idadeCliente2 = anoAtual - anoNascimentoCliente2;

        // Imprimir listagem
        System.out.println("Listagem dos Clientes\n");
        System.out.println("Ano atual: " + anoAtual);

        System.out.println("---------------------------");

        // Cliente 1
        System.out.println("Nome: " + nomeCliente1);
        System.out.println("Data de Nascimento: " + anoNascimentoCliente1);
        System.out.println("Idade: " + idadeCliente1);
        System.out.println("Classificação Etária: " + getClassificacaoEtaria(idadeCliente1) + "\n");

        System.out.println("---------------------------");

        // Cliente 2
        System.out.println("Nome: " + nomeCliente2);
        System.out.println("Data de Nascimento: " + anoNascimentoCliente2);
        System.out.println("Idade: " + idadeCliente2);
        System.out.println("Classificação Etária: " + getClassificacaoEtaria(idadeCliente2) + "\n");
    }

    // Método para obter a classificação etária com base na idade
    private static String getClassificacaoEtaria(int idade) {
        if (idade <= 17) {
            return "ADOLESCENTE";
        } else if (idade >= 18 && idade <= 29) {
            return "JOVEM";
        } else if (idade >= 30 && idade <= 59) {
            return "ADULTO";
        } else {
            return "IDOSO";
        }
    }
}
