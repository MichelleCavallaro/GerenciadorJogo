public class GerenciadorJogo {
    public static void main(String[] args) {
        Baralho meuBaralho = new Baralho();
        System.out.println(meuBaralho.listarCarta());
        meuBaralho.embaralhar();
        System.out.println();
        System.out.println(meuBaralho.listarCarta());
    }
}