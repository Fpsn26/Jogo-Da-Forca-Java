import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BancoPalavras bancoPalavras = new BancoPalavras();
        String[] sorteio = bancoPalavras.sortearPalavra();
        String palavra = sorteio[0];
        String dica = sorteio[1];
        Forca forc = new Forca(palavra, dica);
        Scanner scan = new Scanner(System.in);
        System.out.println("===Bem vindo ao Jogo Da Forca===");

        while (!forc.isFimDeJogo()){
            System.out.println(forc.mostrarPalavraParcial());
            System.out.println("Dica: " + forc.getDica());
            System.out.println("Digite uma letra: ");
            char letra = scan.next().charAt(0);
            if(forc.letraJaTentada(letra)){
                System.out.println("Letra ja tentada!");
            }
            forc.jogar(letra);
            System.out.println("Letras já tentadas: " + forc.getLetrasTentadas());
            System.out.println("Erros: " + forc.getErros() +"/" + forc.getMaxErros());
            if(forc.isFimDeJogo()){
                System.out.println(forc.mostrarResultadoFinal());
                System.out.println("A palavra é: " + forc.getPalavra());
            }
        }

        scan.close();
    }
}
