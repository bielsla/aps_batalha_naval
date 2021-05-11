package batalha_naval;

public class Principal {



	public static void main(String[] args) {
		try {
			System.out.println("Bem vindo ao Batalha Naval Ambiental\n"
						+ "Acerte a posição das empresas que prejudicam nosso meio ambiente e vença o jogo!");
			Tabuleiro t = new Tabuleiro ();

			// A classe principal é utilizada para chamar os métodos da classe tabuleiro
			t.inicializaTabuleiro();	        
	        	System.out.println();
	        
	        do{
	            t.mostraTabuleiro();
	            t.darTiro();
	            t.alteraTabuleiro();
	            

	        }while(t.getAcertos()!=3);	        
	        System.out.println("\n\n\nJogo terminado. Você acertou a posição das empresas em "+t.getTentativas()+" tentativas.");
	        t.mostraTabuleiro();
		} catch (Exception e) {
			System.out.print("Por essa não esperavamos...");
			
		}
	}
	}

