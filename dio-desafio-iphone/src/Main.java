import java.util.Scanner;

public class Main {
private final static Scanner sc = new Scanner(System.in);
private final static Iphone iphone = new Iphone();
    public static void main(String[] args) {
        int opcao;
        String teclado;
        System.out.println("Olá, bem-vindo ao Iphone");
        do{
            System.out.println("==========================");
            System.out.println("O que deseja fazer?");
            System.out.println("[0] Desligar aparelho");
            System.out.println("===REPRODUTOR DE MÚSICA===");
            System.out.println("[1] Tocar música");
            System.out.println("[2] Pausar música");
            System.out.println("[3] Selecionar música");
            System.out.println("===TELEFONE===");
            System.out.println("[4] Ligar para um número");
            System.out.println("[5] Atender");
            System.out.println("[6] Correio de voz");
            System.out.println("===NAVEGADOR DE INTERNET===");
            System.out.println("[7] Abrir nova aba");
            System.out.println("[8] Atualizar página");
            System.out.println("[9] Exibir página");
            System.out.println("==========================");
            opcao = sc.nextInt();
            switch(opcao){
                case 1 -> iphone.tocar();
                case 2 -> iphone.pausar();
                case 3 -> {
                    System.out.println("Digite o nome da música.");
                    sc.nextLine();
                    teclado = sc.nextLine();
                    iphone.selecionarMusica(teclado);
                }
                case 4 -> {
                    System.out.println("Digite o número");
                    sc.nextLine();
                    teclado = sc.nextLine();
                    iphone.ligar(teclado);
                }
                case 5 -> iphone.atender();
                case 6 -> iphone.iniciarCorreioVoz();
                case 7 -> iphone.adicionarNovaAba();
                case 8 -> iphone.atualizarPagina();
                case 9 -> iphone.exibirPagina("https://docs.oracle.com/en/java/");
                case 0 -> System.exit(0);
            }
        }while(true);
    }
}

