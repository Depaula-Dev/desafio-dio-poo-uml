package src;
public class Iphone {
    public static void main(String[] args) {
        
        System.out.println("Iniciando Iphone");

        System.out.println();

        //INSTANCIANDO A CLASSE APARELHO TELEFONICO
        AparelhoTelefonico aparelhoteleTelefonico = new AparelhoTelefonico();
        String numero = "(XX) XXXXX-XXXX";
        aparelhoteleTelefonico.atender();
        aparelhoteleTelefonico.ligar(numero);
        aparelhoteleTelefonico.iniciarCorreioVoz();

        System.out.println();

        //INSTANCIANDO A CLASSE REPRODUTOR MUSICAL
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical(); 
        String musica = "O Sol - Vitor Kley";
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica(musica);

        System.out.println();

        NavegadorNaInternet navegadorNaInternet = new NavegadorNaInternet();
        String url = "https://www.xxxxxxxx.com.br";
        navegadorNaInternet.exibirPagina(url);
        navegadorNaInternet.atualizarPagina();
        navegadorNaInternet.adicionarNovaAba();

    }
    
}
