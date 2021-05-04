package batalha_naval;

public class EmpresaC extends Industria {
	
	public EmpresaC(String nome) {
		super(nome);
	}

	@Override
	public void texto_especial() {
		System.out.println("A Fábrica " + super.getNome() +" está com uma plantação de baunilha que estão devastando a flora da região próxima\n"
							+ "possivelmente extinguindo plantas que são extremamente raras\n"
							+ " e que possivelmente ainda não foram descobertos, denunciada com sucesso!");
		
	}


}



