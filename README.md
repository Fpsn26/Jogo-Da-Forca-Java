
# 🎯 Jogo da Forca em Java (Terminal)

Um jogo **clássico da forca**, totalmente implementado em **Java** para execução no **terminal**.  
Ideal para praticar:

- Lógica de programação
- Estruturas de dados
- Manipulação de strings
- Modularização e orientação a objetos em Java

O jogo realiza sorteio de palavras, fornece dicas, gerencia tentativas e oferece feedback visual completo ao usuário.

---

## 📌 Funcionalidades

- ✅ **Banco de Palavras Interno** com dicas temáticas
- ✅ **Sorteio Aleatório** a cada nova partida
- ✅ **Interface de Terminal** limpa e intuitiva
- ✅ **Controle de Tentativas** com limite de 6 erros
- ✅ **Exibição Visual** de progresso e letras tentadas
- ✅ **Validação de Entrada** e prevenção de letras repetidas
- ✅ **Mensagens Dinâmicas** de vitória, derrota e acertos

---

## 🖼️ Demonstração

```text
===Bem vindo ao Jogo Da Forca===
_ _ _ _

Dica: Linguagem de programacao
Digite uma letra: A
Letras já tentadas: [A]
Erros: 0

_ A _ A
Dica: Linguagem de programacao
Digite uma letra: E
Letra ja tentada!
Letras já tentadas: [A, E]
Erros: 1

_ A _ A
Dica: Linguagem de programacao
Digite uma letra: J
Letras já tentadas: [A, E, J]
Erros: 1

J A _ A
...

Parabéns você venceu!

```

---

## ⚙️ Estrutura do Projeto

| Arquivo / Classe       | Responsabilidade                                                                 |
|------------------------|----------------------------------------------------------------------------------|
| `Main.java`            | Inicia o jogo e gerencia o fluxo principal da aplicação.                        |
| `Forca.java`           | Controla a lógica do jogo: acertos, erros, letras tentadas, vitória/derrota.   |
| `BancoPalavras.java`   | Contém as palavras e dicas. Sorteia uma nova palavra para cada partida.         |

---

## 🛠️ Como Executar

> Projeto 100 % Java puro – **sem dependências externas**

### ⚙️ Requisitos

- **JDK 8+** instalado
- `javac` e `java` configurados no `PATH`

### ▶️ Passos

1. Abra o terminal na raiz do projeto
2. Compile os arquivos:

```bash
javac src/*.java
```

3. Execute o jogo:

```bash
java -cp src Main
```

---

## 📋 Banco de Palavras

O jogo possui um banco com termos comuns em **programação e tecnologia**. Exemplos:

| Palavra           | Dica                                |
|-------------------|-------------------------------------|
| `JAVA`            | Linguagem de programacao            |
| `ENCAPSULAMENTO`  | Principio da POO                    |
| `COMPUTADOR`      | Maquina de processamento            |
| `ALGORITMO`       | Sequencia de passos logicos         |
| `HARDWARE`        | Parte fisica do computador          |
| `HERANCA`         | Reuso de codigo em POO              |
| `POLIMORFISMO`    | Objeto que assume varias formas     |

---

## 📜 Licença

Este projeto está sob a **Licença MIT** – consulte [`LICENSE.md`](LICENSE.md) para mais detalhes.

&copy; 2025 Felipe Sanches
    