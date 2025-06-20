import java.util.Random;

public class BancoPalavras {
    private final String[][] palavras = {
            { "JAVA", "Linguagem de programacao" },
            { "COMPUTADOR", "Maquina de processamento" },
            { "ENCAPSULAMENTO", "Principio da POO" },
            { "ALGORITMO", "Sequencia de passos logicos" },
            { "HARDWARE", "Parte fisica do computador" },
            { "POLIMORFISMO", "Objeto que assume varias formas" },
            { "INTERFACE", "Contrato entre classes" },
            { "VARIAVEL", "Espaco nomeado na memoria" },
            { "COMPILADOR", "Traduz codigo fonte para binario" },
            { "DEBUG", "Processo de encontrar erros" },
            { "FRAMEWORK", "Conjunto de bibliotecas e padroes" },
            { "LINUX", "Sistema operacional livre" },
            { "THREAD", "Fluxo de execucao paralelo" },
            { "BANCODEDADOS", "Armazena informacoes estruturadas" },
            { "BYTECODE", "Codigo intermediario da JVM" },
            { "PACOTE", "Organiza classes no Java" },
            { "PROGRAMA", "Conjunto de instrucoes executaveis" },
            { "INTERNET", "Rede mundial de computadores" },
            { "HERANCA", "Reuso de codigo em POO" },
            { "EXCECAO", "Evento anomalo na execucao" }
    };

    public String[] sortearPalavra() {
        Random rand = new Random();
        int idx = rand.nextInt(palavras.length);
        return palavras[idx];
    }

}