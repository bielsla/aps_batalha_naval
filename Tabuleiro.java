package batalha_naval;

import java.util.Scanner;

public class Tabuleiro {

	EmpresaA empresaA = new EmpresaA ("G&P");
	EmpresaB empresaB = new EmpresaB ("Cola-Coca");
	EmpresaC empresaC = new EmpresaC ("Nestr�");
	private int tentativas, acertos;
	private Integer tiroX;
	private Integer tiroY;
	private int[][] tabuleiro = new int[6][6];
	//Mensagem padr�o que vai ser utilizado em alguns casos
	private String indexInvalido = "Pera ai! Voc� est� indo para uma �rea que voc� n�o tem permiss�o.\n"
									+ "Volte e escolha uma outra �rea!";
	
	
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

	
	//Nesse metodo o tabuleiro � inicializado
	public void inicializaTabuleiro(){
        for(int linha=0 ; linha < 6 ; linha++ )
            for(int coluna=0 ; coluna < 6 ; coluna++ )
                tabuleiro[linha][coluna]=-1;
    }
	
	/* Ap�s inicializado aqui nesse met�do ele � exibido, 
	 * inicialmente com "=" para sinalizar que a posi��o ainda n�o foi atingida
	 * o tabuleiro � alterado com "*" caso erre a posi��o
	 * e com o "X" caso a posi��o seja a correta
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
	 * Aqui recebemos a entrada do usu�rio, 
	 * ele deve passar apenas n�meros para que possamos verificar a posi��o no tabuleiro
	 * � feito tamb�m uma verifica��o se o n�mero passado existe no tabuleiro
	 * e � verificado tamb�m se n�o foi passado uma letra
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
            	System.out.println("Use apenas n�meros!");     	
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
            	System.out.println("Use apenas n�meros!"); 
            }
                   
        	} while(tiroY == null);
    }

    
    //Nesse m�todo � verificado se o n�mero passado pelo usu�rio � o mesmo do n�mero aleat�rio para o usu�rio
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
    
    
    /*J� nesse m�todo � feito a altera��o no tabuleiro, caso o usu�rio acerte a posi��o
     * Mudamos para "X" no tabuleiro
     * Caso a posi��o esteja incorreta � alterado para "*"
     */
    public void alteraTabuleiro(){
		tentativas++;
		
		if(tabuleiro[tiroX][tiroY] == 1 || tabuleiro[tiroX][tiroY] == 0) {
			System.out.println("Voc� j� vasculhou essa posi��o, tente outra!");
		}else {
		       if(acertou() == true) {
		            tabuleiro[tiroX][tiroY]=1;
		            acertos++;
		        	tiroX = null;
		        	tiroY = null;
		        } else
		            tabuleiro[tiroX][tiroY]=0;
		       		System.out.println("Voc� vasculhou o local e n�o encontrou nada, tudo certo por aqui!");
		        	tiroX = null;
		        	tiroY = null;
		    }

	}
			
}
 

