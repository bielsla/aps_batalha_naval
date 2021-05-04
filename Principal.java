package batalha_naval;

public class Principal {



	public static void main(String[] args) {
		try {
		System.out.println("Bem vindo ao Batalha Naval Ambiental\n"
						+ "Acerte a posi��o das empresas que prejudicam nosso meio ambiente e ven�a o jogo!");

		int[][] tabuleiro = new int[6][6];
		Tabuleiro t = new Tabuleiro ();

		
	    t.inicializaTabuleiro(tabuleiro);	        
	        System.out.println();
	        
	        do{
	            t.mostraTabuleiro(tabuleiro);
	            t.darTiro();
	            
	            t.alteraTabuleiro(tabuleiro);
	            

	        }while(t.getAcertos()!=3);
	        
	        System.out.println("\n\n\nJogo terminado. Voc� acertou a posi��o das empresas em "+t.getTentativas()+" tentativas.");
	        t.mostraTabuleiro(tabuleiro);
		} catch (Exception e) {
			System.out.print("Por essa n�o esperavamos...");
			
		}
	}
	}

