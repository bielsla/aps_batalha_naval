package batalha_naval;

public class EmpresaC extends Industria {
	
	public EmpresaC(String nome) {
		super(nome);
	}

	@Override
	public void texto_especial() {
		System.out.println("A F�brica " + super.getNome() +" est� com uma planta��o de baunilha que est�o devastando a flora da regi�o pr�xima\n"
							+ "possivelmente extinguindo plantas que s�o extremamente raras\n"
							+ " e que possivelmente ainda n�o foram descobertos, denunciada com sucesso!");
		
	}


}



