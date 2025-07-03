public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("Tocando agora: %s.\n", musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("URL da página: %s\n", url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz. Deixe sua mensagem após o sinal *pi*");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida.");
    }

    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para %s...\n", numero);
    }
}
