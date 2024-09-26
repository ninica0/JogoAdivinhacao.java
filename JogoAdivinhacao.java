import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		      Random random = new Random();
		      int numerosecreto=random.nextInt(100)+1;
		      int tentativas = 0;
		      int palpite;
		      boolean acertou = false;

 
		      System.out.println("Bem-vindo ao jogo de adivinhação!");
		        System.out.println("Eu escolhi um número entre 1 e 100. Tente adivinhar!");
		        
		        while (!acertou) {
		            System.out.print("Digite seu palpite: ");
		            palpite = sc.nextInt();
		            tentativas++;
		            if (palpite < 1 || palpite > 100) {
		            	System.out.println("Escolha apenas números entre 1 e 100: ");
		            }else if (palpite < numerosecreto) {
		            	System.out.println("Muito baixo, tente novamente: ");
		            }else if (palpite > numerosecreto) {
		            	System.out.println("Muito alto, tente novamente: ");
		            }else {
		            	acertou= true;
		            	System.out.println("Parabéns, você adivinhou o número em "+tentativas+ " tentativas");
		            }

		        }
		        
	}
}

