import java.util.ArrayList;

public class Forca {
    private String palavra;
    private String dica;
    private int erros;
    private final int maxErros = 6;
    private ArrayList<Character> letrasTentadas;

    public Forca(String palavra, String dica, int erros, ArrayList<Character> letrasTentadas) {
        this.palavra = palavra;
        this.dica = dica;
        this.erros = erros;
        this.letrasTentadas = letrasTentadas;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getMaxErros() {
        return maxErros;
    }

    public ArrayList<Character> getLetrasTentadas() {
        return letrasTentadas;
    }

    public void setLetrasTentadas(ArrayList<Character> letrasTentadas) {
        this.letrasTentadas = letrasTentadas;
    }

}
