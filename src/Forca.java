import java.util.Set;
import java.util.HashSet;

public class Forca {
    private String palavra;
    private String dica;
    private int erros;
    private static final int maxErros = 6;
    private Set<Character> letrasTentadas;

    public Forca(String palavra, String dica) {
        if (palavra == null || palavra.trim().isEmpty()) {
            throw new IllegalArgumentException("Palavra não pode ser nula ou vazia.");
        }
        if (dica == null || dica.trim().isEmpty()) {
            throw new IllegalArgumentException("Dica não pode ser nula ou vazia.");
        }

        this.palavra = palavra.trim().toUpperCase();
        this.dica = dica.trim();
        this.erros = 0;
        this.letrasTentadas = new HashSet<>();
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        if (palavra == null || palavra.trim().isEmpty()) {
            throw new IllegalArgumentException("Palavra não pode ser nula ou vazia.");
        }
        this.palavra = palavra.trim().toUpperCase();
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        if (dica == null || dica.trim().isEmpty()) {
            throw new IllegalArgumentException("Dica não pode ser nula ou vazia.");
        }
        this.dica = dica.trim();
    }

    public int getErros() {
        return erros;
    }

    public int getMaxErros() {
        return maxErros;
    }

    public Set<Character> getLetrasTentadas() {
        return letrasTentadas;
    }

    public boolean letraJaTentada(char letra) {
        char letraConvertida = Character.toUpperCase(letra);
        return letrasTentadas.contains(letraConvertida);
    }

    public boolean jogar(char letra) {
        char letraConvertida = Character.toUpperCase(letra);
        if (letraJaTentada(letraConvertida)) {
            return false;
        }

        letrasTentadas.add(letraConvertida);

        if (palavra.contains(Character.toString(letraConvertida))) {
            return true;
        } else {
            erros++;
            return false;
        }
    }

    public String mostrarPalavraParcial() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letrasTentadas.contains(letra)) {
                resultado.append(letra + " ");
            } else {
                resultado.append("_ ");
            }
        }
        return resultado.toString().trim();

    }

    public boolean isFimDeJogo() {
        if (erros == maxErros || venceu()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean venceu() {
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (!letrasTentadas.contains(letra)) {
                return false;
            }
        }
        return true;
    }

    public String mostrarResultadoFinal() {
        if (venceu()) {
            return "Você venceu";
        } else {
            return "Você perdeu";
        }
    }

}
