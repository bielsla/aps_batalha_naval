package batalha_naval;

public class EmpresaB extends Industria {

	public EmpresaB(String nome) {
		super(nome);
	}

	//Metódo abstrato sendo SobreEscrito
	@Override
	public void texto_especial() {
		System.out.println("Você encontrou uma empresa chamada " + super.getNome() + " e ela não utilizava filtros para os vapores tóxicos que eram liberados para a atmosfera,\n"
							+ " ela estava destruindo o lençol freático, denunciada com sucesso!");
		
	}
}
