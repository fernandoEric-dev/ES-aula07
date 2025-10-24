public class App {
    public static void main(String[] args) throws Exception {
        Arvore<String> a = new Arvore<>("José");

        No<String> n1 = new No<>("Fernando");
        No<String> n2 = new No<>("Maria");

        a.getRaiz().addFilho(n1);
        a.getRaiz().addFilho(n2);

        No<String> n3 = new No<>("Enzo");
        No<String> n4 = new No<>("Leticia");
        No<String> n5 = new No<>("Paloma");
        No<String> n6 = new No<>("Erick");
        No<String> n7 = new No<>("Fernanda");

        n1.addFilho(n3);
        n1.addFilho(n4);
        n1.addFilho(n5);

        n2.addFilho(n6);
        n2.addFilho(n7);

        System.out.println("Pré - Ordem");
        a.preOrdem();

        System.out.println("Pós - Ordem:");
        a.posOrdem();
    }
}
