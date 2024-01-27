public class ListaClientes {
    public static void main(String[] args) {
        // Cliente 1
        char[] nomeCliente1 = {'F', 'u', 'l', 'a', 'n', 'o'};
        int anoNascimentoCliente1 = 1980;

        // Cliente 2
        char[] nomeCliente2 = {'S', 'i', 'c', 'r', 'a', 'n', 'o'};
        int anoNascimentoCliente2 = 2000;

        // Imprimir listagem
        System.out.println("Listagem dos Clientes\n");

        System.out.println("---------------------------");

        // Cliente 1
        System.out.println("Nome: " + new String(nomeCliente1));
        System.out.println("Data de Nascimento: " + anoNascimentoCliente1 + "\n");

        System.out.println("---------------------------");

        // Cliente 2
        System.out.println("Nome: " + new String(nomeCliente2));
        System.out.println("Data de Nascimento: " + anoNascimentoCliente2 + "\n");
    }
    }
