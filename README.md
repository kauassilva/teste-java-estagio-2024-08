# Teste Técnico Estágio de Desenvolvimento

Neste repositório há o enunciado de todos os problemas e suas respectivas respostas.

Para os problemas que envolviam a criação de um código, há o trecho de código criado junto de comentários de documentação, o link para a devida classe e dos testes unitários criados.


## Problema 1

Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

- Link para a [classe](src/main/java/com/kauassilva/project/FibonacciSequence.java)
- Link para os [testes unitários]()
  
```java
public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type an integer, and check if it is present in the Fibonacci sequence: ");
        int number = scanner.nextInt();

        if (contains(number)) {
            System.out.println("The number " + number + " is present in the Fibonacci sequence");
        } else {
            System.out.println("The number " + number + " is not present in the Fibonacci sequence");
        }

        scanner.close();
    }

    /**
     * Checks if a given number is present in the Fibonacci sequence.
     *
     * @param number The number to be checked.
     * @return {@code true} if the number is present in the Fibonacci sequence, {@code false} otherwise.
     */
    public static boolean contains(int number) {
        int value1 = 0;
        int value2 = 1;

        while (value1 <= number) {
            if (value1 == number || value2 == number) {
                return true;
            }

            int nextValue = value1 + value2;
            value1 = value2;
            value2 = nextValue;
        }

        return false;
    }

}
```


## Problema 2

Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

- Link para a [classe](src/main/java/com/kauassilva/project/OccurrencesOfA.java)
- Link para os [testes unitários]()
  
```java
public class OccurrencesOfA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a text, and check the number of occurrences of the letter 'a'/'A': ");
        String text = scanner.nextLine();

        int occurrences = calculateOccurrences(text);
        System.out.println("The letter 'a'/'A' appears " + occurrences + " times in the text.");

        scanner.close();
    }

    /**
     * Calculates the occurrences of the letter 'a' or 'A' in a given text.
     *
     * @param text The text in which to count the occurrences of 'a' or 'A'.
     * @return The number of occurrences of 'a' or 'A' in the given text.
     */
    private static int calculateOccurrences(String text) {
        int number = 0;

        for (char character : text.toCharArray()) {
            if (character == 'a' || character == 'A') {
                number++;
            }
        }

        return number;
    }

}
```


## Problema 3

Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

```
A valor final da variável 'SOMA' é 66.
```


## Problema 4

Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____

```
a = 9; b = 128; c = 49; d = 100; e = 13; f = 200.
```


## Problema 5

Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

```
Eu ligaria o primeiro interruptor e esperaria um pouco. Depois eu desligaria o primeiro interruptor e ligaria o
segundo interruptor. Imediatamente, após isso, eu iria para a sala da primeira lâmpada, se ela estiver desligada
e fria, o interruptor para essa lâmpada é o terceiro (o que não foi manipulado), se estiver desligada e quente,
o interruptor é o primeiro manipulado, se estiver ligada, o interruptor é o segundo manipulado. Me direciono para
a sala da segunda lâmpada e verifico as mesmas condições da primeira lâmpada. Por fim, a única condição que sobrou
se refere a terceira lâmpada.
```
