package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void exibirPagina(String url) {
        System.out.println( "EXIBINDO PÁGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ABRINDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO...");
    }

    @Override
    public void atender() {
        System.out.println("ALO!??");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ...");
    }

    @Override
    public void tocar() {
       System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA. MUSICA ESCOLHIDA: " + musica);
    }
    
}
