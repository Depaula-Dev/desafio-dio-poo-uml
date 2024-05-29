package src;
import src.interfaces.IReprodutorMusical;

public class ReprodutorMusical implements IReprodutorMusical{
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    public void pausar() {
        System.out.println("Pausando Musica");

    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música favorita: " + musica);
    }

}
