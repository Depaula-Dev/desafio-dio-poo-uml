package src;
import src.interfaces.IAparelhoTelefonico;

public class AparelhoTelefonico implements IAparelhoTelefonico{
    
    public void ligar(String numero) {
        System.out.println("Fazendo Ligação..." + numero);

    }

    public void atender() {
        System.out.println("Recebendo Ligação...");

    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }
}
