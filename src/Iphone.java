
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNet{


    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página.");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

    }
}