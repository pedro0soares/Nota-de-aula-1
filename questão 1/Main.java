import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        p.nome=sc.nextLine();

        System.out.println("DDigite seu cpf: ");
        p.cpf=sc2.nextInt();

        System.out.println("Nota 1: ");
        a.setN1(sc.nextInt());

        System.out.println("Nota 2: ");
        a.setN2(sc.nextInt());

        System.out.println("Nota 3: ");
        a.setN3(sc.nextInt());


        p.exibir_dados();
        a.calcular_media();

    }
}