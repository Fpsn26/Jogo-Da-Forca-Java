# 🎯 Jogo da Forca em Java (Terminal)

Um jogo **clássico da forca**, totalmente implementado em **Java** para ser executado no **terminal**.  
O projeto foi criado para praticar:

- Lógica de programação  
- Estruturas de dados  
- Manipulação de strings  
- Modularização em Java  

Ele oferece uma experiência completa, com sorteio de palavras, dicas, limite de tentativas e feedback claro para o usuário.

---

## 📌 Funcionalidades Principais

- **Banco de Palavras Interno** – conjunto pré‑definido de palavras e dicas.  
- **Sorteio Aleatório** – cada partida seleciona uma palavra aleatoriamente.  
- **Interface de Terminal** – interação simples e intuitiva via console.  
- **Controle de Tentativas** – limite de **6 erros** para adivinhar a palavra.  
- **Feedback Visual** – exibe:

  - Palavra com lacunas (`_ _ _ _`)  
  - Letras já tentadas  
  - Contagem de erros  

- **Validação de Entradas** – impede repetição de letras já usadas.  
- **Mensagens de Status** – informa acertos, erros, vitória ou derrota.

---

## 🖼️ Demonstração de Uso

```text
*********************************
*       JOGO DA FORCA           *
*********************************

Dica: Linguagem de programacao
Palavra: _ _ _ _

Erros: 0/6
Letras tentadas: []

Digite uma letra: A

Boa! Letra correta.

Dica: Linguagem de programacao
Palavra: _ A _ A
Erros: 0/6
Letras tentadas: [A]

Digite uma letra: E

Letra incorreta!

Dica: Linguagem de programacao
Palavra: _ A _ A
Erros: 1/6
Letras tentadas: [A, E]

Digite uma letra: J

Boa! Letra correta.

...

Parabéns! Você venceu!
A palavra era: JAVA
```

---

## ⚙️ Estrutura do Projeto

| Arquivo / Pasta    | Responsabilidade                                                                 |
|--------------------|----------------------------------------------------------------------------------|
| `Main.java`        | **Classe principal** que inicia e controla o fluxo do jogo. **(TODO: implementar)** |
| `Forca.java`       | Modela o estado do jogo (palavra secreta, dica, erros, letras tentadas).         |
| `BancoPalavras.java` | Armazena e fornece aleatoriamente as palavras e suas dicas.                    |

> **Observação:** todas as classes ficam no mesmo diretório raiz para simplificar a compilação via terminal.

---

## 🛠️ Como Executar o Projeto

> É um projeto 100 % Java puro – **sem dependências externas**.

### Pré‑requisitos

- **JDK 8** ou superior instalado (garanta que `java` e `javac` estejam no `PATH`).

### 1. Compilação

Abra o terminal na pasta raiz do projeto e execute:

```bash
javac *.java
```

### 2. Execução

Após compilar, inicie o jogo com:

```bash
java Main
```

> ⚠️ A lógica da classe **`Main.java`** ainda precisa ser implementada conforme descrito neste README.

---

## 📋 Banco de Palavras

O jogo possui um banco interno com **20 palavras** sobre programação e tecnologia. Exemplos:

| Palavra           | Dica                                |
|-------------------|-------------------------------------|
| `JAVA`            | Linguagem de programacao            |
| `COMPUTADOR`      | Maquina de processamento            |
| `ENCAPSULAMENTO`  | Principio da POO                    |
| `ALGORITMO`       | Sequencia de passos logicos         |
| `HARDWARE`        | Parte fisica do computador          |
| `POLIMORFISMO`    | Objeto que assume varias formas     |
| `HERANCA`         | Reuso de codigo em POO              |

---

## 📜 Licença

Este projeto está licenciado sob a **MIT License** – consulte [`LICENSE.md`](LICENSE.md) para detalhes.

&copy; 2025 Felipe Sanches