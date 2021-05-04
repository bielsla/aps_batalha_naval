package batalha_naval;
import java.util.Random;

public abstract class Industria {
	private static Random getrandom = new Random();
	private String nome;
    private int posicaoX; 
    private int posicaoY; 

    public Industria (String nome) {
    	this.nome = nome;
    	rnd();
    }	
    
    public void rnd()
    {
        lock (getrandom); {
            posicaoX = getrandom.nextInt(5);
            posicaoY = getrandom.nextInt(5);
        }
    }
    
    private static void lock(Object random2) {	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPosicaoX() {
        return posicaoX;
    }
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    public abstract void texto_especial();
    
}