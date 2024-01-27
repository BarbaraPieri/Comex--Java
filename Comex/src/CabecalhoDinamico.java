public class CabecalhoDinamico {
    public static void main(String[] args) {
        int tamanhoCabecalho = 40;
        char caractereCabecalho = '*';

        for (int i = 0; i < tamanhoCabecalho * 2; i++) {
            System.out.print(caractereCabecalho);
            if (i == tamanhoCabecalho - 1) {
                System.out.println("\nBem-vindo ao COMEX!");
            }
        }
        System.out.println();

        // incluir esse trecho de código sempre que quiser utilizar o cabeçalho dinâmico.
    }
}