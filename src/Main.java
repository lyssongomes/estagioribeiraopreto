public class Main {
    public static void main(String[] args) {
        //Main.verSeNumEhFibonacci(89);
        //Main.verificaLetraA("Aracaju Capital");
        Main.resultadoSomaQ3();

    }

    /*
     *   1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
     *   (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
     *   ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
     */
    public static void verSeNumEhFibonacci(int num) {
        int i = 0;
        int fib = 0;

        while (fib <= num) {
            fib = seqFibonacci(i);
            if (fib == num) {
                System.out.println(num + " pertence à sequência de Fibonacci!");
                return;
            }
            i++;
        }
        System.out.println(num + " não pertence à sequência de Fibonacci!");
    }

    // Função recursiva e estática usada na questão 1
    public static int seqFibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return seqFibonacci(num - 1) + seqFibonacci(num - 2);
        }
    }

    /*
     *   2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
     *   seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
     */

    public static void verificaLetraA(String palavra){
        int qtdA = 0;
        int qtdAMaiusculo = 0;
        int qtdAMinusculo = 0;

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == 'a'){
                qtdA++;
                qtdAMinusculo++;
            }else if(palavra.charAt(i)== 'A'){
                qtdA++;
                qtdAMaiusculo++;
            }
        }
        if(qtdA > 0){
            System.out.println("Existem "+qtdA+" letras 'ás' na palavra \""+palavra+"\"");
            System.out.println("Delas, "+qtdAMaiusculo+" são maiúsculas e "+qtdAMinusculo+" são minúsculas");
        }else{
            System.out.println("Não existe a letra 'a' na palavra \""+palavra+"\"");
        }
    }

    /*
     *   3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
     */

    public static void resultadoSomaQ3(){
        int soma = 0;
        for(int indice = 12, k = 1; k < indice;){
            k++;
            soma +=k;
        }

        //Ao final do processamento, qual será o valor da variável SOMA?
        System.out.println("A resposta da 3º é "+soma);
    }

    /*
     *   4) Descubra a lógica e complete o próximo elemento:
     *   a) 1, 3, 5, 7, _9_ < são numeros ímpares
     *
     *   b) 2, 4, 8, 16, 32, 64, _128_ < está dobrando o valor
     *   c) 0, 1, 4, 9, 16, 25, 36, _49_ < sequência elevada ao quadrado
     *   d) 4, 16, 36, 64, _100_ < pares elevados ao quadrado
     *   e) 1, 1, 2, 3, 5, 8, _13_ < Fibonacci
     *   f) 2, 10, 12, 16, 17, 18, 19, _21_ < foi chute, porque os últimos três estagnaram em 1
     */

    /*
    *  5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes.
    *  Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser.
    *  Seu objetivo é descobrir qual interruptor controla qual lâmpada.
    *  Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
    *
    * Resposta: Eu usaria um interruptor e iria olhar qual acendeu, então desligaria ele na volta. Ligaria outro interruptor diferente e iria checar qual acendeu desta vez. O interruptor não utilizado seria da lâmpada que não foi vista acesa.
    */

}
