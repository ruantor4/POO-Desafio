package lacamento;

import aparelhoTelefonico.AparelhoTelefonico;
import iphone.Iphone;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Lancamento {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;
        ReprodutorMusical reprodutorMusical = iphone;

        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        navegadorInternet.exibirPagina("www.google.com.br");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Musica - musica.mp3");
    }
    
}
