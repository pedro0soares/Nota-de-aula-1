import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pagamento p = new Pagamento();
        Produto pr = new Produto("preta", "caneta", 873253, 200, 5.00, 0.5, 0.03);
        Scanner sc = new Scanner(System.in);

        pr.mostrar_prod();

        // Defina o preço antes de chamar desconto_c
        p.setPreco(pr.getValor());

        System.out.println("Formas de pagamento:");
        System.out.println("Digite 1 se vai pagar no crédito e 2 caso prefira pagar em: Débito, espécie ou pix");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu pagar a caneta no crédito!");
                p.desconto_c();
                break;
            case 2:
                System.out.println("Débito, espécie ou pix. Caso deseje pagar especificamente em espécie, digite 3, caso contrario, digite 0: ");
                int opcao2 = sc.nextInt();
                switch (opcao2) {
                    case 3:
                        System.out.println("Qual o seu valor em espécie? ");
                        p.setValorespecie(sc.nextDouble());
                        p.verificar_troco();
                        break;
                    default:
                        p.desconto_dep();
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close(); // Fechar o scanner
    }
}