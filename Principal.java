package batalha_naval;

public class Principal {



	public static void main(String[] args) {
		try {
			System.out.println("Bem vindo ao Batalha Naval Ambiental\n"
						+ "Acerte a posi��o das empresas que prejudicam nosso meio ambiente e ven�a o jogo!");
			Tabuleiro t = new Tabuleiro ();

			// A classe principal � utilizada para chamar os m�todos da classe tabuleiro
			t.inicializaTabuleiro();	        
	        	System.out.println();
	        
	        do{
	            t.mostraTabuleiro();
	            t.darTiro();
	            t.alteraTabuleiro();
	            

	        }while(t.getAcertos()!=3);	        
	        System.out.println("\n\n\nJogo terminado. Voc� acertou a posi��o das empresas em "+t.getTentativas()+" tentativas.");
	        t.mostraTabuleiro();
		} catch (Exception e) {
			System.out.print("Por essa n�o esperavamos...");
			
		}
	}
	}

