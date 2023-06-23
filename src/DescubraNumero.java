
import java.util.*;

public class DescubraNumero
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numero = rand.nextInt(101);
        int tentativa = 0;

        System.out.println("Descubra o número inteiro entre 0 e 100 em SETE tentativas!");

        for (int i=1 ; i<8 ; i++){
            System.out.print("Tentativa: " + i + "! Por favor, digite um número: ");
            tentativa = scanner.nextInt();
            if (tentativa < 0 || tentativa > 100){
                System.out.println("Digite somente números inteiros entre 0 e 100!");
                i-=1;
            }else if (tentativa == numero){
                System.out.println("Parabéns, acertou!");
                break;
            }else if (tentativa > numero){
                System.out.println("O número digitado é maior que o correto!");
            }else if (tentativa < numero){
                System.out.println("O número digitado é menor que o correto!");
            }

        }
        if (numero != tentativa){
            System.out.println("Você não conseguiu! O número era " + numero);
        }
    }
}

