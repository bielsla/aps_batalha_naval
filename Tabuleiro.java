package batalha_naval;

import java.util.Scanner;

public class Tabuleiro {

	EmpresaA empresaA = new EmpresaA ("G&P");
	EmpresaB empresaB = new EmpresaB ("Cola-Coca");
	EmpresaC empresaC = new EmpresaC ("Nestré");
	private int tentativas, acertos;
	private Integer tiroX;
	private Integer tiroY;
	private int[][] tabuleiro = new int[6][6];
	//Mensagem padrão que vai ser utilizado em alguns casos
	private String indexInvalido = "Pera ai! Você está indo para uma área que você não tem permissão.\n"
									+ "Volte e escolha uma outra área!";
	
	
    //Getter and Setters
    public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	
	//Nesse metodo o tabuleiro é inicializado
	public void inicializaTabuleiro(){
        for(int linha=0 ; linha < 6 ; linha++ )
            for(int coluna=0 ; coluna < 6 ; coluna++ )
                tabuleiro[linha][coluna]=-1;
    }
	
	/* Após inicializado aqui nesse metódo ele é exibido, 
	 * inicialmente com "=" para sinalizar que a posição ainda não foi atingida
	 * o tabuleiro é alterado com "*" caso erre a posição
	 * e com o "X" caso a posição seja a correta
	 */ 	 
	public void mostraTabuleiro(){
        System.out.println("\t0 \t1 \t2 \t3 \t4 \t5");
        System.out.println();

        for(int linha=0 ; linha < 6 ; linha++) {
        	
            System.out.print((linha)+"");
            for(int coluna=0 ; coluna < 6 ; coluna++ ){
                if(tabuleiro[linha][coluna]==-1){
                    System.out.print("\t"+"=");
                }else if(tabuleiro[linha][coluna]==0){
                    System.out.print("\t"+"*");
                }else if(tabuleiro[linha][coluna]==1){
                    System.out.print("\t"+"X");
                }    
            }
            System.out.println();
        }
    	}
	

	/*
	 * Aqui recebemos a entrada do usuário, 
	 * ele deve passar apenas números para que possamos verificar a posição no tabuleiro
	 * é feito também uma verificação se o número passado existe no tabuleiro
	 * e é verificado também se não foi passado uma letra
	 */
    public void darTiro(){
    	boolean opcaoCerta = false;
    	int verifica = 0;
 
        
    	do {
    		Scanner entrada = new Scanner(System.in);
	        verifica = 0;
            System.out.print("Linha: ");
            if(entrada.hasNextInt()) {
            	verifica = entrada.nextInt();
                if (verifica > 5 || verifica < 0)
                	System.out.println(indexInvalido);
                else
                tiroX = verifica;               	
            }else {
            	System.out.println("Use apenas números!");     	
            }	
            
        	} while(tiroX == null);
    	
    	
    	do {
    		
    		Scanner entrada = new Scanner(System.in);
	        verifica = 0;
            System.out.print("Coluna: ");
            if(entrada.hasNextInt()) {
            	verifica = entrada.nextInt();
            	if (verifica > 5 || verifica < 0)
            		System.out.println(indexInvalido);
            	else
            		tiroY = verifica;
            } else {
            	System.out.println("Use apenas números!"); 
            }
                   
        	} while(tiroY == null);
    }

    
    //Nesse método é verificado se o número passado pelo usuário é o mesmo do número aleatório para o usuário
    public boolean acertou(){
    	
    if (tiroX == empresaA.getPosicaoX() && tiroY == empresaA.getPosicaoY()) {
    	empresaA.texto_especial();
        return true;   
    }else if (tiroX == empresaB.getPosicaoX() && tiroY == empresaB.getPosicaoY()) {
    	empresaB.texto_especial();
    	return true;
    }else if (tiroX == empresaC.getPosicaoX() && tiroY == empresaC.getPosicaoY()) {
    	empresaC.texto_especial();
    	return true;
    }
    else {
    	return false;
    }
}
    
    
    /*Já nesse método é feito a alteração no tabuleiro, caso o usuário acerte a posição
     * Mudamos para "X" no tabuleiro
     * Caso a posição esteja incorreta é alterado para "*"
     */
    public void alteraTabuleiro(){
		tentativas++;
		
		if(tabuleiro[tiroX][tiroY] == 1 || tabuleiro[tiroX][tiroY] == 0) {
			System.out.println("Você já vasculhou essa posição, tente outra!");
		}else {
		       if(acertou() == true) {
		            tabuleiro[tiroX][tiroY]=1;
		            acertos++;
		        	tiroX = null;
		        	tiroY = null;
		        } else
		            tabuleiro[tiroX][tiroY]=0;
		       		System.out.println("Você vasculhou o local e não encontrou nada, tudo certo por aqui!");
		        	tiroX = null;
		        	tiroY = null;
		    }

	}
			
}
 

