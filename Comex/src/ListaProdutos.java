public class ListaProdutos {
    public static void main(String[] args) {
        // Produto 1
        char[] nomeProduto1 = {'l', 'i', 'v', 'r', 'o'};
        double precoProduto1 = 49.95;

        // Produto 2
        char[] nomeProduto2 = {'C', 'e', 'l', 'u', 'l', 'a', 'r'};
        double precoProduto2 = 1470.76;

        // Imprimir listagem
        System.out.println("Listagem dos Produtos\n");

        System.out.println("---------------------------");

        // Produto 1;
        System.out.println("Nome: " + new String(nomeProduto1));
        System.out.println("Preço: R$ " + precoProduto1 + "\n");

        System.out.println("---------------------------");

        // Produto 2
        System.out.println("Nome: " + new String(nomeProduto2));
        System.out.println("Preço: R$ " + precoProduto2 + "\n");
    }
}