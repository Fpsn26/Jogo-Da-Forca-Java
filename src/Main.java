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
            System.out.println("Dica: " + dica);
            System.out.println("Digite uma letra: ");
            char letra = scan.next().charAt(0);
            forc.jogar(letra);
            System.out.println("Letras já tentadas: " + forc.getLetrasTentadas());
        }

        scan.close();
    }
}
