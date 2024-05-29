package src;
import src.interfaces.INavegadorNaInternet;

public class NavegadorNaInternet implements INavegadorNaInternet {
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba...");
    }

    public void atualizarPagina() {
        System.out.println("Aguarde! Atualizando Página...");
    }

}
