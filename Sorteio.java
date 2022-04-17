import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        Random gerador = new Random();
        int c = 1;
        int soma = 0;
        int maior = 0;
        int menor = 100;
        
        while (c <= 1000){
            int n = 1 + gerador.nextInt(100);
            soma += n;
            if (n > maior){
                maior = n;
            }
            if (n < menor){
                menor = n;
            }
            c++;
            System.out.println(n);
        }
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Média = " + soma / 1000f);
    }

    
}