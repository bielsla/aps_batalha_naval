package batalha_naval;

import java.util.Scanner;

public class Tabuleiro {

	EmpresaA empresaA = new EmpresaA ("G&P");
	EmpresaB empresaB = new EmpresaB ("Coca-Cola");
	EmpresaC empresaC = new EmpresaC ("Nestlé");
	private int tentativas, acertos;
	private Integer tiroX;
	private Integer tiroY;
	private String indexInvalido = "Pera ai! Você está indo para uma área que você não tem permissão.\n"
									+ "Volte e escolha uma outra área!";
    
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

	public static void inicializaTabuleiro(int[][] tabuleiro){
        for(int linha=0 ; linha < 6 ; linha++ )
            for(int coluna=0 ; coluna < 6 ; coluna++ )
                tabuleiro[linha][coluna]=-1;
    }
	
	public static void mostraTabuleiro(int[][] tabuleiro){
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
	

    public void darTiro(){
    	int verifica = 0;
        Scanner entrada = new Scanner(System.in);
    	do {
        System.out.print("Linha: ");
        verifica = entrada.nextInt();
        if (verifica > 5 || verifica < 0)
        	System.out.println(indexInvalido);
        else
        tiroX = verifica;
        verifica = 0;
        
        
    	} while(tiroX == null);
    	
    	
    	do {
            System.out.print("Coluna: ");
            verifica = entrada.nextInt();
            if (verifica > 5 || verifica < 0)
            	System.out.println(indexInvalido);
            else
            tiroY = verifica;
            verifica = 0;
            
            
        	} while(tiroY == null);
    }

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
    
    public void alteraTabuleiro(int[][] tabuleiro){
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
 

